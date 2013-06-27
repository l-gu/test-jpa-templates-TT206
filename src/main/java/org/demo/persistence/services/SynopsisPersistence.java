// This Bean has a basic Primary Key : int
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Synopsis ;

/**
 * Basic persistence operations for entity "Synopsis"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface SynopsisPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param synopsis
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Synopsis synopsis) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param bookId
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(int bookId ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param synopsis
	 */
	public void insert(Synopsis synopsis) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param bookId
	 * @return the entity loaded (or null if not found)
	 */
	public Synopsis load(int bookId ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Synopsis> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Synopsis> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Synopsis> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param synopsis
	 * @return
	 */
	public Synopsis save(Synopsis synopsis) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Synopsis> search( Map<String, Object> criteria ) ;
}