/*
 * Created on 2 juil. 2013 ( Date ISO 2013-07-02 - Time 09:44:50 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.persistence;

/**
 * 
 * Very simple persistence service provider (just for tests)
 *
 */
public class PersistenceServiceProvider {

	private final static String SERVICES_ROOT_PACKAGE = PersistenceServiceProvider.class.getPackage().getName() + ".services" ;
	
	/**
	 * Returns a persistence service for the default persistence implementation
	 * @param entityClass
	 * @return
	 */
	public final static <T> T getService( Class<T> entityClass ) {
		return getService( entityClass, PersistenceConfig.PERSISTENCE_IMPLEMENTATION_TYPE );
		//return getService( entityClass, FAKE );
	}
	
	/**
	 * Returns a persistence service for the given persistence implementation
	 * @param serviceInterface
	 * @param implementationType
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public final static <T> T getService( Class<T> serviceInterface, int implementationType ) {
		
		
		if ( serviceInterface != null ) {
			
			//--- 1) define the full class name 
			String pkg    = "" ;
			String suffix = "" ;

			switch ( implementationType ) {
			
			case PersistenceConfig.JPA :
				pkg = SERVICES_ROOT_PACKAGE + ".jpa" ;
				suffix = "JPA" ;
				break ;
				
			case PersistenceConfig.LPA :
				pkg = SERVICES_ROOT_PACKAGE + ".lpa" ;
				suffix = "LPA" ;
				break ;
				
			case PersistenceConfig.FAKE :
				pkg = SERVICES_ROOT_PACKAGE + ".fake" ;
				suffix = "FAKE" ;
				break ;
				
			default :
				throw new RuntimeException("Unknown implementation type !");
			}
			String serviceClassName = pkg + "." + serviceInterface.getSimpleName() + suffix ;
			
			//--- 2) try to load the class 
			Class<?> clazz ;
			Object instance = null ;
			try {
				 clazz = Class.forName(serviceClassName) ;
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("Cannot load class " + serviceClassName );
			}

			if ( serviceInterface.isAssignableFrom(clazz) ) {

				//--- 3) try to create an instance of this class 
				try {
					instance = clazz.newInstance();
				} catch (InstantiationException e) {
					throw new RuntimeException("Cannot create instance for class " + serviceClassName + " (InstantiationException)");
				} catch (IllegalAccessException e) {
					throw new RuntimeException("Cannot create instance for class " + serviceClassName + " (IllegalAccessException)");
				}
				return (T) instance ;
				
			}
			else {
				throw new RuntimeException("Class " + serviceClassName + " is not an implementation of " + serviceInterface.getSimpleName() );
			}
		}
		else {
			throw new IllegalArgumentException("Entity class argument is null !");
		}
	}
	
}

