
package org.demo.persistence.services.jpa;

import org.demo.bean.Author;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.AuthorPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Author" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class AuthorPersistenceJPA extends GenericJpaService<Author, Integer> implements AuthorPersistence {

	/**
	 * Constructor
	 */
	public AuthorPersistenceJPA() {
		super(Author.class);
	}

	public Author load( int id  ) {
		return super.load(  id  );
	}

	public boolean delete( int id  ) {
		return super.delete(  id  );
	}

	public boolean delete(Author entity) {
		if ( entity != null ) {
			return super.delete(  entity.getId()  );		
		}
		return false ;
	}

}