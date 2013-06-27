// This Bean has a composite Primary Key : ReviewKey
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Review ;

/**
 * Basic persistence operations for entity "Review"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface ReviewPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param review
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Review review) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param customerCode
	 * @param bookId
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(String customerCode, int bookId ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param review
	 */
	public void insert(Review review) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param customerCode
	 * @param bookId
	 * @return the entity loaded (or null if not found)
	 */
	public Review load(String customerCode, int bookId ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Review> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Review> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Review> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param review
	 * @return
	 */
	public Review save(Review review) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Review> search( Map<String, Object> criteria ) ;
}