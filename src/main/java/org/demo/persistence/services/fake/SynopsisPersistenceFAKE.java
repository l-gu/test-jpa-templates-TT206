package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Synopsis ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.SynopsisPersistence;

/**
 * Fake persistence service implementation ( entity "Synopsis" )
 *
 * @author Telosys Tools Generator
 */
public class SynopsisPersistenceFAKE extends GenericFakeService<Synopsis> implements SynopsisPersistence {

	public SynopsisPersistenceFAKE () {
		super(Synopsis.class);
	}
	
	protected Synopsis buildEntity(int index) {
		Synopsis entity = new Synopsis();
		// Init fields with mock values
		entity.setBookId( nextInteger() ) ;
		entity.setSynopsis( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Synopsis entity) {
		log("delete ( Synopsis : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int bookId  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Synopsis entity) {
		log("insert ( Synopsis : " + entity + ")" ) ;
	}

	public Synopsis load( int bookId  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Synopsis> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Synopsis> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Synopsis> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Synopsis save(Synopsis entity) {
		log("insert ( Synopsis : " + entity + ")" ) ;
		return entity;
	}

	public List<Synopsis> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
