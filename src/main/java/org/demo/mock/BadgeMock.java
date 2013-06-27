package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Badge ;
import org.demo.mock.tool.MockValues;

public class BadgeMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Badge createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Badge createInstance( int badgeNumber ) {
		Badge entity = new Badge();
		// Init primary key fields
		entity.setBadgeNumber( badgeNumber) ;
		// Init other fields
      		entity.setAuthorizationLevel( mockValues.nextShort() ) ; // short
      		entity.setEndOfValidity( mockValues.nextDate() ) ; // java.util.Date
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Badge> createList(int count) {
		List<Badge> list = new LinkedList<Badge>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
