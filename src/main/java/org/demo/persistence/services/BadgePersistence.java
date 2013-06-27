// This Bean has a basic Primary Key : int
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Badge ;

/**
 * Basic persistence operations for entity "Badge"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface BadgePersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param badge
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Badge badge) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param badgeNumber
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(int badgeNumber ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param badge
	 */
	public void insert(Badge badge) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param badgeNumber
	 * @return the entity loaded (or null if not found)
	 */
	public Badge load(int badgeNumber ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Badge> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Badge> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Badge> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param badge
	 * @return
	 */
	public Badge save(Badge badge) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Badge> search( Map<String, Object> criteria ) ;
}