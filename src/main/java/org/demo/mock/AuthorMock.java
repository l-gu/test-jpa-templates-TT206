package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Author ;
import org.demo.mock.tool.MockValues;

public class AuthorMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Author createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextInteger() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Author createInstance( int id ) {
		Author entity = new Author();
		// Init primary key fields
		entity.setId( id) ;
		// Init other fields
		entity.setFirstName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
		entity.setLastName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Author> createList(int count) {
		List<Author> list = new LinkedList<Author>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
