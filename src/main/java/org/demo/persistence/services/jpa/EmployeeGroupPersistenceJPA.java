
package org.demo.persistence.services.jpa;

import org.demo.bean.EmployeeGroup ;
import org.demo.bean.EmployeeGroupKey ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.EmployeeGroupPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "EmployeeGroup" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class EmployeeGroupPersistenceJPA extends GenericJpaService<EmployeeGroup, EmployeeGroupKey> implements EmployeeGroupPersistence {

	/**
	 * Constructor
	 */
	public EmployeeGroupPersistenceJPA() {
		super(EmployeeGroup.class);
	}

	public EmployeeGroup load( String employeeCode, short groupId  ) {
		// Build the composite key
		EmployeeGroupKey key = new EmployeeGroupKey(  employeeCode,  groupId  );
		return super.load( key );
	}

	public boolean delete( String employeeCode, short groupId  ) {
		// Build the composite key
		EmployeeGroupKey key = new EmployeeGroupKey(  employeeCode,  groupId  );
		return super.delete( key );
	}

	public boolean delete(EmployeeGroup entity) {
		if ( entity != null ) {
			// Build the composite key
			EmployeeGroupKey key = new EmployeeGroupKey(  entity.getEmployeeCode(),  entity.getGroupId()  );
			return super.delete( key );
		}
		return false ;
	}

}
