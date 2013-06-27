package org.demo.samples.persistence.services;

import org.demo.bean.Author;
import org.demo.persistence.PersistenceConfig;
import org.demo.persistence.PersistenceServiceProvider;
import org.demo.persistence.services.AuthorPersistence;

public class TestAuthorPersistence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AuthorPersistence service = PersistenceServiceProvider.getService(AuthorPersistence.class, PersistenceConfig.JPA);
		//AuthorPersistence service = PersistenceServiceProvider.getService(AuthorPersistence.class, PersistenceConfig.FAKE);
		
		Author author = service.load(12);
		
		System.out.println("Author loaded : " + author );
	}

}
