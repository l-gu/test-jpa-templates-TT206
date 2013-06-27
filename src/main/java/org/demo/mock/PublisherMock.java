package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Publisher ;
import org.demo.mock.tool.MockValues;

public class PublisherMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Publisher createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Publisher createInstance( int code ) {
		Publisher entity = new Publisher();
		// Init primary key fields
		entity.setCode( code) ;
		// Init other fields
		entity.setCountryCode( mockValues.nextString(2) ) ; // java.lang.String ( max length = 2 ) 
		entity.setName( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
		entity.setEmail( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
		entity.setContact( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
		entity.setCity( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
      		entity.setZipCode( mockValues.nextInteger() ) ; // java.lang.Integer
		entity.setPhone( mockValues.nextString(14) ) ; // java.lang.String ( max length = 14 ) 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Publisher> createList(int count) {
		List<Publisher> list = new LinkedList<Publisher>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
