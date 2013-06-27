
package org.demo.persistence.services.jpa;

import org.demo.bean.BookOrder ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.BookOrderPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "BookOrder" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class BookOrderPersistenceJPA extends GenericJpaService<BookOrder, Integer> implements BookOrderPersistence {

	/**
	 * Constructor
	 */
	public BookOrderPersistenceJPA() {
		super(BookOrder.class);
	}

	public BookOrder load( int id  ) {
		return super.load(  id  );
	}

	public boolean delete( int id  ) {
		return super.delete(  id  );
	}

	public boolean delete(BookOrder entity) {
		if ( entity != null ) {
			return super.delete(  entity.getId()  );		
		}
		return false ;
	}

}
