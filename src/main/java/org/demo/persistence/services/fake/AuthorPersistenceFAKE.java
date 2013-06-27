package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Author ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.AuthorPersistence;

/**
 * Fake persistence service implementation ( entity "Author" )
 *
 * @author Telosys Tools Generator
 */
public class AuthorPersistenceFAKE extends GenericFakeService<Author> implements AuthorPersistence {

	public AuthorPersistenceFAKE () {
		super(Author.class);
	}
	
	protected Author buildEntity(int index) {
		Author entity = new Author();
		// Init fields with mock values
		entity.setId( nextInteger() ) ;
		entity.setFirstName( nextString() ) ;
		entity.setLastName( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Author entity) {
		log("delete ( Author : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int id  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Author entity) {
		log("insert ( Author : " + entity + ")" ) ;
	}

	public Author load( int id  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Author> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Author> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Author> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Author save(Author entity) {
		log("insert ( Author : " + entity + ")" ) ;
		return entity;
	}

	public List<Author> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}