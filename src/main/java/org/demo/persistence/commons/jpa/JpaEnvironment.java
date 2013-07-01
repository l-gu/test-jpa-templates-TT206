package org.demo.persistence.commons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 * JPA environment for JPA operations execution
 * 
 */
public class JpaEnvironment {

	private final String persistenceUnitName ; 
	
	private final EntityManagerFactory emf ; 
	
	/**
	 * Constructor 
	 * @param persistenceUnitName the name of the JPA persistence unit to be used
	 */
	public JpaEnvironment(String persistenceUnitName ) {
		super();
		this.persistenceUnitName = persistenceUnitName ;
		this.emf = Persistence.createEntityManagerFactory(persistenceUnitName);
	}


	public final String getPersistenceUnitName() {
		return this.persistenceUnitName ;
	}
	
//	public final <T> T executeWithTransaction(JpaOperation operation, Class<T> resultClass) throws PersistenceException {
	public final Object executeWithTransaction(JpaOperation operation) throws PersistenceException {
		
		Object result = null ;
		EntityManager em = emf.createEntityManager();
		try {
			EntityTransaction transaction = em.getTransaction();

			try {
				// Begin Transaction
				transaction.begin();
				
				// Execute application JPA operation with the current EntityManager
				result = operation.exectue(em);
				
				// Commit Transaction
				transaction.commit();
				
			} finally {
				// Rollback Transaction if Transaction is still active ( Commit not done )
				if (transaction.isActive())
					transaction.rollback();
			}
		} finally {
			// Ensure EntityManager is closed 
			em.close();
		}
		
//		return castResult(result, resultClass);
		return result ;
	}

//	public final <T> T executeWithoutTransaction(JpaOperation operation, Class<T> resultClass) throws PersistenceException {
	public final Object executeWithoutTransaction(JpaOperation operation) throws PersistenceException {
		
		Object result = null ;
		EntityManager em = emf.createEntityManager();
		try {
				// Execute application JPA operation with the current EntityManager
				result = operation.exectue(em);
				
		} finally {
			// Ensure EntityManager is closed 
			em.close();
		}
		
//		return castResult(result, resultClass);
		return result ;
	}
	
//	@SuppressWarnings("unchecked")
//	private <T> T castResult(Object result, Class<T> resultClass) {
//		if ( result != null ) {
//			if ( resultClass.isAssignableFrom(result.getClass()) ) {
//				return (T) result ;				
//			}
//			else {
//				throw new PersistenceException("Invalid operation return type '" 
//						+ result.getClass().getCanonicalName() + "' ( " 
//						+ resultClass.getCanonicalName() + " expected )");
//			}
//		}
//		else {
//			return null ;
//		}
//	}
}
