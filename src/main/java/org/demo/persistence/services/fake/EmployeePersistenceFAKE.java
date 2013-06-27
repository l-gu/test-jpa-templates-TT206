package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Employee ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.EmployeePersistence;

/**
 * Fake persistence service implementation ( entity "Employee" )
 *
 * @author Telosys Tools Generator
 */
public class EmployeePersistenceFAKE extends GenericFakeService<Employee> implements EmployeePersistence {

	public EmployeePersistenceFAKE () {
		super(Employee.class);
	}
	
	protected Employee buildEntity(int index) {
		Employee entity = new Employee();
		// Init fields with mock values
		entity.setCode( nextString() ) ;
		entity.setShopCode( nextString() ) ;
		entity.setFirstName( nextString() ) ;
		entity.setLastName( nextString() ) ;
		entity.setManager( nextShort() ) ;
		entity.setBadgeNumber( nextInteger() ) ;
		entity.setEmail( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Employee entity) {
		log("delete ( Employee : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( String code  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Employee entity) {
		log("insert ( Employee : " + entity + ")" ) ;
	}

	public Employee load( String code  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Employee> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Employee> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Employee> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Employee save(Employee entity) {
		log("insert ( Employee : " + entity + ")" ) ;
		return entity;
	}

	public List<Employee> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
