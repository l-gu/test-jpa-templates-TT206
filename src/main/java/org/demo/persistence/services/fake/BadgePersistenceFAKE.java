package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Badge ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.BadgePersistence;

/**
 * Fake persistence service implementation ( entity "Badge" )
 *
 * @author Telosys Tools Generator
 */
public class BadgePersistenceFAKE extends GenericFakeService<Badge> implements BadgePersistence {

	public BadgePersistenceFAKE () {
		super(Badge.class);
	}
	
	protected Badge buildEntity(int index) {
		Badge entity = new Badge();
		// Init fields with mock values
		entity.setBadgeNumber( nextInteger() ) ;
		entity.setAuthorizationLevel( nextShort() ) ;
		entity.setEndOfValidity( nextDate() ) ;
		return entity ;
	}
	
	
	public boolean delete(Badge entity) {
		log("delete ( Badge : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int badgeNumber  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Badge entity) {
		log("insert ( Badge : " + entity + ")" ) ;
	}

	public Badge load( int badgeNumber  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Badge> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Badge> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Badge> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Badge save(Badge entity) {
		log("insert ( Badge : " + entity + ")" ) ;
		return entity;
	}

	public List<Badge> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}