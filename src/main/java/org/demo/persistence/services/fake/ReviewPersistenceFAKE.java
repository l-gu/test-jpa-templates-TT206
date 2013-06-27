package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Review ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.ReviewPersistence;

/**
 * Fake persistence service implementation ( entity "Review" )
 *
 * @author Telosys Tools Generator
 */
public class ReviewPersistenceFAKE extends GenericFakeService<Review> implements ReviewPersistence {

	public ReviewPersistenceFAKE () {
		super(Review.class);
	}
	
	protected Review buildEntity(int index) {
		Review entity = new Review();
		// Init fields with mock values
		entity.setCustomerCode( nextString() ) ;
		entity.setBookId( nextInteger() ) ;
		entity.setReviewText( nextString() ) ;
		entity.setReviewNote( nextInteger() ) ;
		entity.setCreation( nextDate() ) ;
		entity.setLastUpdate( nextDate() ) ;
		return entity ;
	}
	
	
	public boolean delete(Review entity) {
		log("delete ( Review : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( String customerCode, int bookId  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Review entity) {
		log("insert ( Review : " + entity + ")" ) ;
	}

	public Review load( String customerCode, int bookId  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Review> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Review> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Review> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Review save(Review entity) {
		log("insert ( Review : " + entity + ")" ) ;
		return entity;
	}

	public List<Review> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}