package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Shop ;
import org.demo.mock.tool.MockValues;

public class ShopMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Shop createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(3) );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Shop createInstance( String code ) {
		Shop entity = new Shop();
		// Init primary key fields
		entity.setCode( code) ;
		// Init other fields
		entity.setName( mockValues.nextString(80) ) ; // java.lang.String ( max length = 80 ) 
		entity.setAddress1( mockValues.nextString(80) ) ; // java.lang.String ( max length = 80 ) 
		entity.setAddress2( mockValues.nextString(80) ) ; // java.lang.String ( max length = 80 ) 
      		entity.setZipCode( mockValues.nextInteger() ) ; // java.lang.Integer
		entity.setCity( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
		entity.setCountryCode( mockValues.nextString(2) ) ; // java.lang.String ( max length = 2 ) 
		entity.setPhone( mockValues.nextString(14) ) ; // java.lang.String ( max length = 14 ) 
		entity.setEmail( mockValues.nextString(50) ) ; // java.lang.String ( max length = 50 ) 
		entity.setExecutive( mockValues.nextString(4) ) ; // java.lang.String ( max length = 4 ) 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Shop> createList(int count) {
		List<Shop> list = new LinkedList<Shop>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
