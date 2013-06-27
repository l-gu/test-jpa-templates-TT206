package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Publisher ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.PublisherPersistence;

/**
 * Fake persistence service implementation ( entity "Publisher" )
 *
 * @author Telosys Tools Generator
 */
public class PublisherPersistenceFAKE extends GenericFakeService<Publisher> implements PublisherPersistence {

	public PublisherPersistenceFAKE () {
		super(Publisher.class);
	}
	
	protected Publisher buildEntity(int index) {
		Publisher entity = new Publisher();
		// Init fields with mock values
		entity.setCode( nextInteger() ) ;
		entity.setCountryCode( nextString() ) ;
		entity.setName( nextString() ) ;
		entity.setEmail( nextString() ) ;
		entity.setContact( nextString() ) ;
		entity.setCity( nextString() ) ;
		entity.setZipCode( nextInteger() ) ;
		entity.setPhone( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Publisher entity) {
		log("delete ( Publisher : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int code  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Publisher entity) {
		log("insert ( Publisher : " + entity + ")" ) ;
	}

	public Publisher load( int code  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Publisher> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Publisher> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Publisher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Publisher save(Publisher entity) {
		log("insert ( Publisher : " + entity + ")" ) ;
		return entity;
	}

	public List<Publisher> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
