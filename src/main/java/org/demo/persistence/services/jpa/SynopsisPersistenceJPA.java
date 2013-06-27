
package org.demo.persistence.services.jpa;

import org.demo.bean.Synopsis ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.SynopsisPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Synopsis" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class SynopsisPersistenceJPA extends GenericJpaService<Synopsis, Integer> implements SynopsisPersistence {

	/**
	 * Constructor
	 */
	public SynopsisPersistenceJPA() {
		super(Synopsis.class);
	}

	public Synopsis load( int bookId  ) {
		return super.load(  bookId  );
	}

	public boolean delete( int bookId  ) {
		return super.delete(  bookId  );
	}

	public boolean delete(Synopsis entity) {
		if ( entity != null ) {
			return super.delete(  entity.getBookId()  );		
		}
		return false ;
	}

}
