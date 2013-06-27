package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Customer ;
import org.demo.mock.tool.MockValues;

public class CustomerMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Customer createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(5) );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Customer createInstance( String code ) {
		Customer entity = new Customer();
		// Init primary key fields
		entity.setCode( code) ;
		// Init other fields
		entity.setCountryCode( mockValues.nextString(2) ) ; // java.lang.String ( max length = 2 ) 
		entity.setFirstName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
		entity.setLastName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
		entity.setLogin( mockValues.nextString(20) ) ; // java.lang.String ( max length = 20 ) 
		entity.setPassword( mockValues.nextString(20) ) ; // java.lang.String ( max length = 20 ) 
      		entity.setAge( mockValues.nextInteger() ) ; // java.lang.Integer
		entity.setCity( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
      		entity.setZipCode( mockValues.nextInteger() ) ; // java.lang.Integer
		entity.setPhone( mockValues.nextString(20) ) ; // java.lang.String ( max length = 20 ) 
      		entity.setReviewer( mockValues.nextShort() ) ; // java.lang.Short
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Customer> createList(int count) {
		List<Customer> list = new LinkedList<Customer>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
