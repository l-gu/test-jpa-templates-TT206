// This Bean has a basic Primary Key : String
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Employee ;

/**
 * Basic persistence operations for entity "Employee"
 * 
 * @author Telosys Tools Generator
 *
 */
public interface EmployeePersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param employee
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Employee employee) ;

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
	 * @param employee
	 */
	public void insert(Employee employee) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param code
	 * @return the entity loaded (or null if not found)
	 */
	public Employee load(String code ) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Employee> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Employee> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Employee> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param employee
	 * @return
	 */
	public Employee save(Employee employee) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Employee> search( Map<String, Object> criteria ) ;
}