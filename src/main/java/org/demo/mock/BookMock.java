package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Book ;
import org.demo.mock.tool.MockValues;

public class BookMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Book createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Book createInstance( int id ) {
		Book entity = new Book();
		// Init primary key fields
		entity.setId( id) ;
		// Init other fields
      		entity.setPublisherId( mockValues.nextInteger() ) ; // int
      		entity.setAuthorId( mockValues.nextInteger() ) ; // int
		entity.setIsbn( mockValues.nextString(13) ) ; // java.lang.String ( max length = 13 ) 
		entity.setTitle( mockValues.nextString(160) ) ; // java.lang.String ( max length = 160 ) 
      		entity.setPrice( mockValues.nextBigDecimal() ) ; // java.math.BigDecimal
      		entity.setQuantity( mockValues.nextInteger() ) ; // java.lang.Integer
      		entity.setDiscount( mockValues.nextInteger() ) ; // java.lang.Integer
      		entity.setAvailability( mockValues.nextShort() ) ; // java.lang.Short
      		entity.setBestSeller( mockValues.nextShort() ) ; // java.lang.Short
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Book> createList(int count) {
		List<Book> list = new LinkedList<Book>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
