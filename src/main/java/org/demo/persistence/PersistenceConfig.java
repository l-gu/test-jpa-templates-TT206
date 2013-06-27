package org.demo.persistence;

/**
 * Persistence configuration  
 * 
 * @author Telosys Tools
 *
 */
public class PersistenceConfig {

	
	/**
	 * Different types of implementation
	 */
	public final static int FAKE = 0 ;
	public final static int JPA  = 1 ;
	public final static int LPA  = 2 ;
	

	/**
	 * Current implementation to be used
	 */
	//public static final int PERSISTENCE_IMPLEMENTATION_TYPE = FAKE ;
	public static final int PERSISTENCE_IMPLEMENTATION_TYPE = JPA ;
	
	
	/**
	 * JPA Persistence Unit name defined in "persistence.xml" file
	 */
	public static final String JPA_PERSISTENCE_UNIT_NAME = "derby-bookstore";
	

}
