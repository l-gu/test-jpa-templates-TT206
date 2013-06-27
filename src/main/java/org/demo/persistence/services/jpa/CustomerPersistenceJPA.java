
package org.demo.persistence.services.jpa;

import org.demo.bean.Customer ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.CustomerPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Customer" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class CustomerPersistenceJPA extends GenericJpaService<Customer, String> implements CustomerPersistence {

	/**
	 * Constructor
	 */
	public CustomerPersistenceJPA() {
		super(Customer.class);
	}

	public Customer load( String code  ) {
		return super.load(  code  );
	}

	public boolean delete( String code  ) {
		return super.delete(  code  );
	}

	public boolean delete(Customer entity) {
		if ( entity != null ) {
			return super.delete(  entity.getCode()  );		
		}
		return false ;
	}

}
