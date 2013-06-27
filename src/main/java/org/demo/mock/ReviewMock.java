package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Review ;
import org.demo.mock.tool.MockValues;

public class ReviewMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Review createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(5), mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Review createInstance( String customerCode, int bookId ) {
		Review entity = new Review();
		// Init primary key fields
		entity.setCustomerCode( customerCode) ;
		entity.setBookId( bookId) ;
		// Init other fields
		entity.setReviewText( mockValues.nextString(32700) ) ; // java.lang.String ( max length = 32700 ) 
      		entity.setReviewNote( mockValues.nextInteger() ) ; // java.lang.Integer
      		entity.setCreation( mockValues.nextDate() ) ; // java.util.Date
      		entity.setLastUpdate( mockValues.nextDate() ) ; // java.util.Date
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Review> createList(int count) {
		List<Review> list = new LinkedList<Review>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
