
package org.demo.persistence.services.jpa;

import org.demo.bean.Country ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.CountryPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Country" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class CountryPersistenceJPA extends GenericJpaService<Country, String> implements CountryPersistence {

	/**
	 * Constructor
	 */
	public CountryPersistenceJPA() {
		super(Country.class);
	}

	public Country load( String code  ) {
		return super.load(  code  );
	}

	public boolean delete( String code  ) {
		return super.delete(  code  );
	}

	public boolean delete(Country entity) {
		if ( entity != null ) {
			return super.delete(  entity.getCode()  );		
		}
		return false ;
	}

}