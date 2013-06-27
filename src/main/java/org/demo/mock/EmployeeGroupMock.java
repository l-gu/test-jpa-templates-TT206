package org.demo.mock;

import java.util.LinkedList;
import java.util.List;

import org.demo.bean.EmployeeGroup ;
import org.demo.mock.tool.MockValues;

public class EmployeeGroupMock {

	private MockValues mockValues = new MockValues();
	
	/**
	 * Creates an instance with random Primary Key
	 * @return
	 */
	public EmployeeGroup createInstance() {
		// Primary Key values

		return createInstance( mockValues.nextString(4), mockValues.nextShort() );
	}
	
	/**
	 * Creates an instance with a specific Primary Key
	 * @param id1
	 * @return
	 */
	public EmployeeGroup createInstance( String employeeCode, short groupId ) {
		EmployeeGroup entity = new EmployeeGroup();
		// Init primary key fields
		entity.setEmployeeCode( employeeCode) ;
		entity.setGroupId( groupId) ;
		// Init other fields
		return entity ;
	}
	
	/**
	 * Creates a list of instances
	 * @param count number of instances to be created
	 * @return
	 */
	public List<EmployeeGroup> createList(int count) {
		List<EmployeeGroup> list = new LinkedList<EmployeeGroup>();		
		for ( int i = 1 ; i <= count ; i++ ) {
			list.add( createInstance() );
		}
		return list;
	}
}
