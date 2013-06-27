/*
 * JUnit test case for Country persistence service
 * Created on 27 juin 2013 ( Time 17:47:56 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.test.persistence;


import org.demo.bean.Country ;
import org.demo.mock.CountryMock;
import org.demo.persistence.PersistenceServiceProvider;
import org.demo.persistence.services.CountryPersistence;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test case for Country persistence
 * 
 * @author Telosys Tools Generator
 *
 */
public class CountryPersistenceTest 
{
	@Test
	public void test1() {
		
		System.out.println("Test Country persistence : delete + load ..." );
		
		CountryPersistence service = PersistenceServiceProvider.getService(CountryPersistence.class);
		
		CountryMock mock = new CountryMock();
		
		// TODO : set primary key values here 
		process( service, mock, "A"  );
		// process( service, mock, ... );
	}

	private void process(CountryPersistence service, CountryMock mock, String code ) {
		System.out.println("----- "  );
		System.out.println(" . load : " );
		Country entity = service.load( code );
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
			entity = mock.createInstance( code ) ;
			Assert.assertNotNull(entity);

			// No reference : insert is possible 
			// Try to insert the new instance
			System.out.println(" . insert : " + entity );
			service.insert(entity);
			System.out.println("   inserted : " + entity );

			System.out.println(" . delete : " );
			boolean deleted = service.delete( code );
			System.out.println("   deleted = " + deleted);
			Assert.assertTrue(deleted) ;
		}		
	}
}
