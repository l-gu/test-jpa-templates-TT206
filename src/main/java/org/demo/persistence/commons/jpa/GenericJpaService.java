package org.demo.persistence.commons.jpa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.demo.persistence.PersistenceConfig;


/**
 * Generic JPA service operations (provided by Telosys Tools)
 * 
 * @author Stephane LABBE, Laurent GUERIN
 *
 * @param <T>
 * @param <PK>
 */
public abstract class GenericJpaService<T, PK extends java.io.Serializable> {

	private static final Predicate[] VOID_PREDICATE_ARRAY = {};
	
	//=========================================================================================================
	// Static fields for EntityManager (just for the demo)
	
	/**
	 * Single instance of EntityManagerFactory
	 */
	private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory( PersistenceConfig.JPA_PERSISTENCE_UNIT_NAME );
	
	/**
	 * EntityManager ThreadLocal storage
	 */
	private static final ThreadLocal<EntityManager> threadLocal = new ThreadLocal<EntityManager>();
	
	//=========================================================================================================

	/**
	 * The class of the entity managed by this instance of service
	 */
	private final Class<T> persistentClass;

	/**
	 * Constructor
	 * @param persistentClass
	 */
	public GenericJpaService(final Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	/**
	 * Returns the EntityManager associated with the current thread (create a new one if necessary) <br>
	 * (utility method just for the demo)
	 * @return EntityManager
	 */
	private EntityManager getEntityManager() {
		EntityManager manager = threadLocal.get();
		if (manager == null || manager.isOpen() == false) {
			manager = emf.createEntityManager();
			threadLocal.set(manager);
		}
		return manager;
	}

	/**
	 * Find entity By Id
	 * @param <T>
	 * @param id
	 * @return
	 */
	public T load(final PK id) {
		final EntityManager em = getEntityManager();
		return (T) em.find(this.persistentClass, id);
	}

	/**
	 * Load all entities
	 * @param <T>
	 * @param query
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> loadAll() {
		final EntityManager em = getEntityManager();
		final Query query = em.createQuery("from " + persistentClass.getName());
		return query.getResultList();
	}

	/**
	 * Load a list of entities using a named query without parameter
	 * @param queryName
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> loadByNamedQuery(final String queryName) {
		final EntityManager em = getEntityManager();
		//final TypedQuery<T> q = em.createQuery(query, this.persistentClass);
		final Query query = em.createNamedQuery(queryName);
		return query.getResultList();
	}

	/**
	 * Load a list of entities using a named query with parameters
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<T> loadByNamedQuery(final String queryName, final Map<String, Object> queryParameters) {
		final EntityManager em = getEntityManager();
		final Query query = em.createNamedQuery(queryName);

		final Iterator<String> i = queryParameters.keySet().iterator();
		while (i.hasNext()) {
			String key = i.next();
			query.setParameter(key, queryParameters.get(key));
		}

		return query.getResultList();
	}

	/**
	 * Insert entity ( TRANSACTIONAL )
	 * @param <T>
	 * @return
	 */
	public void insert(final T entity) {
		final EntityManager em = getEntityManager();
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}

	/**
	 * Save entity ( TRANSACTIONAL )
	 * @param <T>
	 * @param entity
	 * @return
	 */
	public T save(T entityToSave) {
		final EntityManager em = getEntityManager();
		em.getTransaction().begin();
		T managedEntity = em.merge(entityToSave);
		em.getTransaction().commit();
		return managedEntity;
	}
	
	/**
	 * Delete entity by pk ( TRANSACTIONAL )
	 * @param pk
	 */
	public boolean delete(final PK pk) {
		final EntityManager em = getEntityManager();
		final T entity = em.find(this.persistentClass, pk);
		if (entity != null) {
			em.getTransaction().begin();
			em.remove(entity);
			em.getTransaction().commit();
			return true ;
		}
		else {
			return false ;
		}
	}

	public List<T> search( final Map<String, Object> queryParameters ) {
		System.out.println("=== SEARCH");
		final EntityManager em = getEntityManager();
		if ( queryParameters != null  ) {
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(persistentClass);
			Root<T> from = criteriaQuery.from(persistentClass);

			List<Predicate> predicates = new ArrayList<Predicate>();

			for ( Map.Entry<String, Object> e : queryParameters.entrySet() ) {
				String expression = e.getKey() ;
				Object value = e.getValue() ;
				
				System.out.println("=== Criterion : " + expression + " : " + value );
				
				if ( value != null ) {
					boolean operatorFound = false ;
					int i = expression.indexOf(' ') ;
					if ( i >= 0 ) {
						String name = expression.substring(0, i);
						String oper = expression.substring(i, expression.length()).trim();
						System.out.println("name = '" + name + "'   oper = '" + oper + "'  value = '" + value + "'" );
						if ( oper.length() > 0 ) {
							operatorFound = true ;
							if ( value instanceof String ) {
								String strValue = (String) value ;
								if ( "=".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.equal( from.get(name), strValue ) ;
									predicates.add(p) ;
								}
								else if ( "like".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.like( from.<String>get(name), strValue ) ;
									predicates.add(p) ;
								}
								else {
									throw new RuntimeException("Search : invalid operator '" + oper +"' for String attribute") ;
								}
							}
							else if ( value instanceof Number ) {
								Number numValue = (Number) value ;
								if ( "=".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.equal( from.<Number>get(name), numValue ) ;
									predicates.add(p) ;
								}
								else if ( "!=".equalsIgnoreCase(oper) || "<>".equalsIgnoreCase(oper)) {
									Predicate p = criteriaBuilder.notEqual( from.<Number>get(name), numValue ) ;
									predicates.add(p) ;
								}
								else if ( ">".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.gt( from.<Number>get(name), numValue ) ;
									predicates.add(p) ;
								}
								else if ( "<".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.lt( from.<Number>get(name), numValue ) ;
									predicates.add(p) ;
								}
								else if ( ">=".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.ge( from.<Number>get(name), numValue ) ;
									predicates.add(p) ;
								}
								else if ( "<=".equalsIgnoreCase(oper) ) {
									Predicate p = criteriaBuilder.le( from.<Number>get(name), numValue ) ;
									predicates.add(p) ;
								}
								else {
									throw new RuntimeException("Search : invalid operator '" + oper +"' for Number attribute") ;
								}
							}
						}
					}
					if ( ! operatorFound ) {
						predicates.add( criteriaBuilder.equal( from.get(expression), value ) ) ;
					}
				}
			}
			
			criteriaQuery.where( predicates.toArray(VOID_PREDICATE_ARRAY) );
			
			TypedQuery<T> typedQuery = em.createQuery(criteriaQuery);
			return typedQuery.getResultList();
		}
		else {
			return this.loadAll();
		}
	}

}
