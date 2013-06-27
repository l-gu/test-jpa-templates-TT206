/*
 * JUnit test case for Synopsis persistence service
 * Created on 27 juin 2013 ( Time 17:47:57 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.test.persistence;


import org.demo.bean.Synopsis ;
import org.demo.mock.SynopsisMock;
import org.demo.persistence.PersistenceServiceProvider;
import org.demo.persistence.services.SynopsisPersistence;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test case for Synopsis persistence
 * 
 * @author Telosys Tools Generator
 *
 */
public class SynopsisPersistenceTest 
{
	@Test
	public void test1() {
		
		System.out.println("Test Synopsis persistence : delete + load ..." );
		
		SynopsisPersistence service = PersistenceServiceProvider.getService(SynopsisPersistence.class);
		
		SynopsisMock mock = new SynopsisMock();
		
		// TODO : set primary key values here 
		process( service, mock, 0  );
		// process( service, mock, ... );
	}

	private void process(SynopsisPersistence service, SynopsisMock mock, int bookId ) {
		System.out.println("----- "  );
		System.out.println(" . load : " );
		Synopsis entity = service.load( bookId );
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
			entity = mock.createInstance( bookId ) ;
			Assert.assertNotNull(entity);

			// This entity references the following entities : 
			// . Book
			/* Insert only if references are OK
			// Try to insert the new instance
			System.out.println(" . insert : " + entity );
			service.insert(entity);
			System.out.println("   inserted : " + entity );
			*/

			System.out.println(" . delete : " );
			boolean deleted = service.delete( bookId );
			System.out.println("   deleted = " + deleted);
		}		
	}
}
