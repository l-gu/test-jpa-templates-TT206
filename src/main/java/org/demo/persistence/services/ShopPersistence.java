// This Bean has a basic Primary Key : String
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Shop ;

/**
 * Basic persistence operations for entity "Shop"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface ShopPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param shop
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Shop shop) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param code
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(String code ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param shop
	 */
	public void insert(Shop shop) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param code
	 * @return the entity loaded (or null if not found)
	 */
	public Shop load(String code ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Shop> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Shop> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Shop> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param shop
	 * @return
	 */
	public Shop save(Shop shop) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Shop> search( Map<String, Object> criteria ) ;
}
