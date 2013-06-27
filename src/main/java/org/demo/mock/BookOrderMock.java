package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.BookOrder ;
import org.demo.mock.tool.MockValues;

public class BookOrderMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public BookOrder createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public BookOrder createInstance( int id ) {
		BookOrder entity = new BookOrder();
		// Init primary key fields
		entity.setId( id) ;
		// Init other fields
		entity.setShopCode( mockValues.nextString(3) ) ; // java.lang.String ( max length = 3 ) 
		entity.setCustomerCode( mockValues.nextString(5) ) ; // java.lang.String ( max length = 5 ) 
		entity.setEmployeeCode( mockValues.nextString(4) ) ; // java.lang.String ( max length = 4 ) 
      		entity.setDate( mockValues.nextDate() ) ; // java.util.Date
      		entity.setState( mockValues.nextInteger() ) ; // java.lang.Integer
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<BookOrder> createList(int count) {
		List<BookOrder> list = new LinkedList<BookOrder>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}