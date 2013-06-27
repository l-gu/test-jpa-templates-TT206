// This Bean has a basic Primary Key : int
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.BookOrder ;

/**
 * Basic persistence operations for entity "BookOrder"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface BookOrderPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookorder
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(BookOrder bookorder) ;

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
	 * @param bookorder
	 */
	public void insert(BookOrder bookorder) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param id
	 * @return the entity loaded (or null if not found)
	 */
	public BookOrder load(int id ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<BookOrder> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<BookOrder> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<BookOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookorder
	 * @return
	 */
	public BookOrder save(BookOrder bookorder) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<BookOrder> search( Map<String, Object> criteria ) ;
}