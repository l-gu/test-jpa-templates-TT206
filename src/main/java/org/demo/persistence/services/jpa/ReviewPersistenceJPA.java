
package org.demo.persistence.services.jpa;

import org.demo.bean.Review ;
import org.demo.bean.ReviewKey ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.ReviewPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Review" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class ReviewPersistenceJPA extends GenericJpaService<Review, ReviewKey> implements ReviewPersistence {

	/**
	 * Constructor
	 */
	public ReviewPersistenceJPA() {
		super(Review.class);
	}

	public Review load( String customerCode, int bookId  ) {
		// Build the composite key
		ReviewKey key = new ReviewKey(  customerCode,  bookId  );
		return super.load( key );
	}

	public boolean delete( String customerCode, int bookId  ) {
		// Build the composite key
		ReviewKey key = new ReviewKey(  customerCode,  bookId  );
		return super.delete( key );
	}

	public boolean delete(Review entity) {
		if ( entity != null ) {
			// Build the composite key
			ReviewKey key = new ReviewKey(  entity.getCustomerCode(),  entity.getBookId()  );
			return super.delete( key );
		}
		return false ;
	}

}