/*
 * Created on 28 juin 2013 ( Time 07:20:39 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.persistence.services;

import java.util.List;
import java.util.Map;

import org.demo.bean.Author ;

/**
 * Basic persistence operations for entity "Author"
 * 
 * This Bean has a basic Primary Key : int
 *
 * @author Telosys Tools Generator
 *
 */
public interface AuthorPersistence {

	/**
	 * Deletes the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param author
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(Author author) ;

	/**
	 * Deletes the entity by its Primary Key <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param id
	 * @return true if found and deleted, false if not found
	 */
	public boolean delete(int id) ;

	/**
	 * Inserts the given entity and commit <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param author
	 */
	public void insert(Author author) ;

	/**
	 * Loads the entity for the given Primary Key <br>
	 * @param id
	 * @return the entity loaded (or null if not found)
	 */
	public Author load(int id) ;

	/**
	 * Loads ALL the entities (use with caution)
	 * @return
	 */
	public List<Author> loadAll() ;

	/**
	 * Loads a list of entities using the given "named query" without parameter 
	 * @param queryName
	 * @return
	 */
	public List<Author> loadByNamedQuery(String queryName) ;

	/**
	 * Loads a list of entities using the given "named query" with parameters 
	 * @param queryName
	 * @param queryParameters
	 * @return
	 */
	public List<Author> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) ;

	/**
	 * Saves (create or update) the given entity <br>
	 * Transactional operation ( begin transaction and commit )
	 * @param author
	 * @return
	 */
	public Author save(Author author) ;

	/**
	 * Search the entities matching the given search criteria
	 * @param criteria
	 * @return
	 */
	public List<Author> search( Map<String, Object> criteria ) ;
}
