package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Customer ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.CustomerPersistence;

/**
 * Fake persistence service implementation ( entity "Customer" )
 *
 * @author Telosys Tools Generator
 */
public class CustomerPersistenceFAKE extends GenericFakeService<Customer> implements CustomerPersistence {

	public CustomerPersistenceFAKE () {
		super(Customer.class);
	}
	
	protected Customer buildEntity(int index) {
		Customer entity = new Customer();
		// Init fields with mock values
		entity.setCode( nextString() ) ;
		entity.setCountryCode( nextString() ) ;
		entity.setFirstName( nextString() ) ;
		entity.setLastName( nextString() ) ;
		entity.setLogin( nextString() ) ;
		entity.setPassword( nextString() ) ;
		entity.setAge( nextInteger() ) ;
		entity.setCity( nextString() ) ;
		entity.setZipCode( nextInteger() ) ;
		entity.setPhone( nextString() ) ;
		entity.setReviewer( nextShort() ) ;
		return entity ;
	}
	
	
	public boolean delete(Customer entity) {
		log("delete ( Customer : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( String code  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Customer entity) {
		log("insert ( Customer : " + entity + ")" ) ;
	}

	public Customer load( String code  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Customer> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Customer> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Customer> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Customer save(Customer entity) {
		log("insert ( Customer : " + entity + ")" ) ;
		return entity;
	}

	public List<Customer> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
