
package org.demo.persistence.services.jpa;

import org.demo.bean.Employee ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.EmployeePersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Employee" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class EmployeePersistenceJPA extends GenericJpaService<Employee, String> implements EmployeePersistence {

	/**
	 * Constructor
	 */
	public EmployeePersistenceJPA() {
		super(Employee.class);
	}

	public Employee load( String code  ) {
		return super.load(  code  );
	}

	public boolean delete( String code  ) {
		return super.delete(  code  );
	}

	public boolean delete(Employee entity) {
		if ( entity != null ) {
			return super.delete(  entity.getCode()  );		
		}
		return false ;
	}

}
