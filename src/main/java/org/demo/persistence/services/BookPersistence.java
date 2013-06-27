// This Bean has a basic Primary Key : int
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Book ;

/**
 * Basic persistence operations for entity "Book"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface BookPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param book
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Book book) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param id
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(int id ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param book
	 */
	public void insert(Book book) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param id
	 * @return the entity loaded (or null if not found)
	 */
	public Book load(int id ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Book> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Book> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Book> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param book
	 * @return
	 */
	public Book save(Book book) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Book> search( Map<String, Object> criteria ) ;
}
