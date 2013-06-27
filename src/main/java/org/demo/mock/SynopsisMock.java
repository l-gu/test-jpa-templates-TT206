package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Synopsis ;
import org.demo.mock.tool.MockValues;

public class SynopsisMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Synopsis createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Synopsis createInstance( int bookId ) {
		Synopsis entity = new Synopsis();
		// Init primary key fields
		entity.setBookId( bookId) ;
		// Init other fields
		entity.setSynopsis( mockValues.nextString(32700) ) ; // java.lang.String ( max length = 32700 ) 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Synopsis> createList(int count) {
		List<Synopsis> list = new LinkedList<Synopsis>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
