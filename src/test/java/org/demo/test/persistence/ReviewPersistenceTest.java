/*
 * JUnit test case for Review persistence service
 * Created on 27 juin 2013 ( Time 17:47:56 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.test.persistence;


import org.demo.bean.Review ;
import org.demo.mock.ReviewMock;
import org.demo.persistence.PersistenceServiceProvider;
import org.demo.persistence.services.ReviewPersistence;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit test case for Review persistence
 * 
 * @author Telosys Tools Generator
 *
 */
public class ReviewPersistenceTest 
{
	@Test
	public void test1() {
		
		System.out.println("Test Review persistence : delete + load ..." );
		
		ReviewPersistence service = PersistenceServiceProvider.getService(ReviewPersistence.class);
		
		ReviewMock mock = new ReviewMock();
		
		// TODO : set primary key values here 
		process( service, mock, "A" , 0  );
		// process( service, mock, ... );
	}

	private void process(ReviewPersistence service, ReviewMock mock, String customerCode, int bookId ) {
		System.out.println("----- "  );
		System.out.println(" . load : " );
		Review entity = service.load( customerCode, bookId );
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
			entity = mock.createInstance( customerCode, bookId ) ;
			Assert.assertNotNull(entity);

			// This entity references the following entities : 
			// . Book
			// . Customer
			/* Insert only if references are OK
			// Try to insert the new instance
			System.out.println(" . insert : " + entity );
			service.insert(entity);
			System.out.println("   inserted : " + entity );
			*/

			System.out.println(" . delete : " );
			boolean deleted = service.delete( customerCode, bookId );
			System.out.println("   deleted = " + deleted);
		}		
	}
}