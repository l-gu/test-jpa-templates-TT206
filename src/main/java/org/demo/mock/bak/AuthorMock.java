package org.demo.mock.bak;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Author;
import org.demo.mock.tool.MockValues;

public class AuthorMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Create instance with random Primary Key
	 * @return
	 */
	public Author createInstance() {
		return createInstance(mockValues.nextInteger() )  ;
	}
	
	/**
	 * Create instance with specific Primary Key
	 * @param id1
	 * @return
	 */
	public Author createInstance(int id1) {
		Author entity = new Author();
		// Init fields with mock values
		entity.setId( id1 ) ;
		entity.setFirstName( mockValues.nextString(40) ) ;
		entity.setLastName( mockValues.nextString(40) ) ;
		return entity ;
	}
	
	/**
	 * Create a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Author> createList(int count) {
		List<Author> list = new LinkedList<Author>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance(i) );
		}
		return list;
	}
	
}
