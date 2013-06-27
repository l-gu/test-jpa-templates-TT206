
package org.demo.persistence.services.jpa;

import org.demo.bean.Book ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.BookPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Book" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class BookPersistenceJPA extends GenericJpaService<Book, Integer> implements BookPersistence {

	/**
	 * Constructor
	 */
	public BookPersistenceJPA() {
		super(Book.class);
	}

	public Book load( int id  ) {
		return super.load(  id  );
	}

	public boolean delete( int id  ) {
		return super.delete(  id  );
	}

	public boolean delete(Book entity) {
		if ( entity != null ) {
			return super.delete(  entity.getId()  );		
		}
		return false ;
	}

}
