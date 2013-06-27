// This Bean has a basic Primary Key : int
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Publisher ;

/**
 * Basic persistence operations for entity "Publisher"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface PublisherPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param publisher
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Publisher publisher) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param code
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(int code ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param publisher
	 */
	public void insert(Publisher publisher) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param code
	 * @return the entity loaded (or null if not found)
	 */
	public Publisher load(int code ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Publisher> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Publisher> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Publisher> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param publisher
	 * @return
	 */
	public Publisher save(Publisher publisher) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Publisher> search( Map<String, Object> criteria ) ;
}