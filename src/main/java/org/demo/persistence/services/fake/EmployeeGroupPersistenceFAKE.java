package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.EmployeeGroup ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.EmployeeGroupPersistence;

/**
 * Fake persistence service implementation ( entity "EmployeeGroup" )
 *
 * @author Telosys Tools Generator
 */
public class EmployeeGroupPersistenceFAKE extends GenericFakeService<EmployeeGroup> implements EmployeeGroupPersistence {

	public EmployeeGroupPersistenceFAKE () {
		super(EmployeeGroup.class);
	}
	
	protected EmployeeGroup buildEntity(int index) {
		EmployeeGroup entity = new EmployeeGroup();
		// Init fields with mock values
		entity.setEmployeeCode( nextString() ) ;
		entity.setGroupId( nextShort() ) ;
		return entity ;
	}
	
	
	public boolean delete(EmployeeGroup entity) {
		log("delete ( EmployeeGroup : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( String employeeCode, short groupId  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(EmployeeGroup entity) {
		log("insert ( EmployeeGroup : " + entity + ")" ) ;
	}

	public EmployeeGroup load( String employeeCode, short groupId  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<EmployeeGroup> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<EmployeeGroup> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<EmployeeGroup> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public EmployeeGroup save(EmployeeGroup entity) {
		log("insert ( EmployeeGroup : " + entity + ")" ) ;
		return entity;
	}

	public List<EmployeeGroup> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}