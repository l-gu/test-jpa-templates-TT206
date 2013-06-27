
package org.demo.persistence.services.jpa;

import org.demo.bean.Publisher ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.PublisherPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Publisher" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class PublisherPersistenceJPA extends GenericJpaService<Publisher, Integer> implements PublisherPersistence {

	/**
	 * Constructor
	 */
	public PublisherPersistenceJPA() {
		super(Publisher.class);
	}

	public Publisher load( int code  ) {
		return super.load(  code  );
	}

	public boolean delete( int code  ) {
		return super.delete(  code  );
	}

	public boolean delete(Publisher entity) {
		if ( entity != null ) {
			return super.delete(  entity.getCode()  );		
		}
		return false ;
	}

}
