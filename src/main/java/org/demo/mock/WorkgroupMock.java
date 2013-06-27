package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.Workgroup ;
import org.demo.mock.tool.MockValues;

public class WorkgroupMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public Workgroup createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextShort() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public Workgroup createInstance( short id ) {
		Workgroup entity = new Workgroup();
		// Init primary key fields
		entity.setId( id) ;
		// Init other fields
		entity.setName( mockValues.nextString(40) ) ; // java.lang.String ( max length = 40 ) 
		entity.setDescription( mockValues.nextString(600) ) ; // java.lang.String ( max length = 600 ) 
      		entity.setCreationDate( mockValues.nextDate() ) ; // java.util.Date
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<Workgroup> createList(int count) {
		List<Workgroup> list = new LinkedList<Workgroup>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
