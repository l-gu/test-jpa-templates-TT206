// This Bean has a composite Primary Key : BookOrderItemKey
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.BookOrderItem ;

/**
 * Basic persistence operations for entity "BookOrderItem"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface BookOrderItemPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookorderitem
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(BookOrderItem bookorderitem) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookOrderId
	 * @param bookId
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(int bookOrderId, int bookId ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookorderitem
	 */
	public void insert(BookOrderItem bookorderitem) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param bookOrderId
	 * @param bookId
	 * @return the entity loaded (or null if not found)
	 */
	public BookOrderItem load(int bookOrderId, int bookId ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<BookOrderItem> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<BookOrderItem> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<BookOrderItem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookorderitem
	 * @return
	 */
	public BookOrderItem save(BookOrderItem bookorderitem) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<BookOrderItem> search( Map<String, Object> criteria ) ;
}
