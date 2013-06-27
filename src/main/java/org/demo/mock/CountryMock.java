package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Country ;
import org.demo.mock.tool.MockValues;

public class CountryMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Country createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(2) );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Country createInstance( String code ) {
		Country entity = new Country();
		// Init primary key fields
		entity.setCode( code) ;
		// Init other fields
		entity.setName( mockValues.nextString(45) ) ; // java.lang.String ( max length = 45 ) 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Country> createList(int count) {
		List<Country> list = new LinkedList<Country>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
