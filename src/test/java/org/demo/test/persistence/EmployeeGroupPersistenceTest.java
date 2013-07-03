/*
 * Created on 2 juil. 2013 ( Time 09:44:50 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.test.persistence;


import org.demo.bean.EmployeeGroup ;
import org.demo.mock.EmployeeGroupMock;
import org.demo.persistence.PersistenceServiceProvider;
import org.demo.persistence.services.EmployeeGroupPersistence;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test case for EmployeeGroup persistence service
 * 
 * @author Telosys Tools Generator
 *
 */
public class EmployeeGroupPersistenceTest 
{
	@Test
	public void test1() {
		
		System.out.println("Test EmployeeGroup persistence : delete + load ..." );
		
		EmployeeGroupPersistence service = PersistenceServiceProvider.getService(EmployeeGroupPersistence.class);
		
		EmployeeGroupMock mock = new EmployeeGroupMock();
		
		// TODO : set primary key values here 
		process( service, mock, "A" , (short)0  );
		// process( service, mock, ... );
	}

	private void process(EmployeeGroupPersistence service, EmployeeGroupMock mock, String employeeCode, short groupId ) {
		System.out.println("----- "  );
		System.out.println(" . load : " );
		EmployeeGroup entity = service.load( employeeCode, groupId );
		if ( entity != null ) {
			// Found 
			System.out.println("   FOUND : " + entity );
			
			// Save (update) with the same values to avoid database integrity errors  
			System.out.println(" . save : " + entity );
			service.save(entity);
			System.out.println("   saved : " + entity );
		}
		else {
			// Not found 
			System.out.println("   NOT FOUND" );
			// Create a new instance 
			entity = mock.createInstance( employeeCode, groupId ) ;
			Assert.assertNotNull(entity);

			/* NB : this entity is a "Join Table" 
			System.out.println(" . insert : " + entity );
			service.insert(entity);
			System.out.println("   inserted : " + entity );
			*/

			System.out.println(" . delete : " );
			boolean deleted = service.delete( employeeCode, groupId );
			System.out.println("   deleted = " + deleted);
		}		
	}
}
