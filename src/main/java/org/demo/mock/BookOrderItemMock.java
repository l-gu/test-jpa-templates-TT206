package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.BookOrderItem ;
import org.demo.mock.tool.MockValues;

public class BookOrderItemMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public BookOrderItem createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger(), mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public BookOrderItem createInstance( int bookOrderId, int bookId ) {
		BookOrderItem entity = new BookOrderItem();
		// Init primary key fields
		entity.setBookOrderId( bookOrderId) ;
		entity.setBookId( bookId) ;
		// Init other fields
      		entity.setQuantity( mockValues.nextInteger() ) ; // int
      		entity.setPrice( mockValues.nextBigDecimal() ) ; // java.math.BigDecimal
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<BookOrderItem> createList(int count) {
		List<BookOrderItem> list = new LinkedList<BookOrderItem>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
