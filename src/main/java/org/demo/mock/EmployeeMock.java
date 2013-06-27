package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Employee ;
import org.demo.mock.tool.MockValues;

public class EmployeeMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Employee createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(4) );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Employee createInstance( String code ) {
		Employee entity = new Employee();
		// Init primary key fields
		entity.setCode( code) ;
		// Init other fields
		entity.setShopCode( mockValues.nextString(3) ) ; // java.lang.String ( max length = 3 ) 
		entity.setFirstName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
		entity.setLastName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
      		entity.setManager( mockValues.nextShort() ) ; // java.lang.Short
      		entity.setBadgeNumber( mockValues.nextInteger() ) ; // java.lang.Integer
		entity.setEmail( mockValues.nextString(60) ) ; // java.lang.String ( max length = 60 ) 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Employee> createList(int count) {
		List<Employee> list = new LinkedList<Employee>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
