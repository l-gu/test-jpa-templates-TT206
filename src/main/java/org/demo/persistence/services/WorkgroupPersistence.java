// This Bean has a basic Primary Key : short
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Workgroup ;

/**
 * Basic persistence operations for entity "Workgroup"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface WorkgroupPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param workgroup
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Workgroup workgroup) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param id
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(short id ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param workgroup
	 */
	public void insert(Workgroup workgroup) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param id
	 * @return the entity loaded (or null if not found)
	 */
	public Workgroup load(short id ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Workgroup> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Workgroup> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Workgroup> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param workgroup
	 * @return
	 */
	public Workgroup save(Workgroup workgroup) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Workgroup> search( Map<String, Object> criteria ) ;
}