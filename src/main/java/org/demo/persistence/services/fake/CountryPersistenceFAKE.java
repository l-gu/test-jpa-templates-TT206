package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Country ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.CountryPersistence;

/**
 * Fake persistence service implementation ( entity "Country" )
 *
 * @author Telosys Tools Generator
 */
public class CountryPersistenceFAKE extends GenericFakeService<Country> implements CountryPersistence {

	public CountryPersistenceFAKE () {
		super(Country.class);
	}
	
	protected Country buildEntity(int index) {
		Country entity = new Country();
		// Init fields with mock values
		entity.setCode( nextString() ) ;
		entity.setName( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Country entity) {
		log("delete ( Country : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( String code  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Country entity) {
		log("insert ( Country : " + entity + ")" ) ;
	}

	public Country load( String code  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Country> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Country> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Country> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Country save(Country entity) {
		log("insert ( Country : " + entity + ")" ) ;
		return entity;
	}

	public List<Country> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
