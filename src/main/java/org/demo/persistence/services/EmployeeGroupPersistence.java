// This Bean has a composite Primary Key : EmployeeGroupKey
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.EmployeeGroup ;

/**
 * Basic persistence operations for entity "EmployeeGroup"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface EmployeeGroupPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param employeegroup
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(EmployeeGroup employeegroup) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param employeeCode
	 * @param groupId
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(String employeeCode, short groupId ) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param employeegroup
	 */
	public void insert(EmployeeGroup employeegroup) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param employeeCode
	 * @param groupId
	 * @return the entity loaded (or null if not found)
	 */
	public EmployeeGroup load(String employeeCode, short groupId ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<EmployeeGroup> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<EmployeeGroup> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<EmployeeGroup> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param employeegroup
	 * @return
	 */
	public EmployeeGroup save(EmployeeGroup employeegroup) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<EmployeeGroup> search( Map<String, Object> criteria ) ;
}
