
package org.demo.persistence.services.jpa;

import org.demo.bean.BookOrderItem ;
import org.demo.bean.BookOrderItemKey ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.BookOrderItemPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "BookOrderItem" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class BookOrderItemPersistenceJPA extends GenericJpaService<BookOrderItem, BookOrderItemKey> implements BookOrderItemPersistence {

	/**
	 * Constructor
	 */
	public BookOrderItemPersistenceJPA() {
		super(BookOrderItem.class);
	}

	public BookOrderItem load( int bookOrderId, int bookId  ) {
		// Build the composite key
		BookOrderItemKey key = new BookOrderItemKey(  bookOrderId,  bookId  );
		return super.load( key );
	}

	public boolean delete( int bookOrderId, int bookId  ) {
		// Build the composite key
		BookOrderItemKey key = new BookOrderItemKey(  bookOrderId,  bookId  );
		return super.delete( key );
	}

	public boolean delete(BookOrderItem entity) {
		if ( entity != null ) {
			// Build the composite key
			BookOrderItemKey key = new BookOrderItemKey(  entity.getBookOrderId(),  entity.getBookId()  );
			return super.delete( key );
		}
		return false ;
	}

}
