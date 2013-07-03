/*
 * Created on 2 juil. 2013 ( Time 09:44:49 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */

package org.demo.persistence.services.jpa;

import org.demo.bean.Badge ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.BadgePersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Badge" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class BadgePersistenceJPA extends GenericJpaService<Badge, Integer> implements BadgePersistence {

	/**
	 * Constructor
	 */
	public BadgePersistenceJPA() {
		super(Badge.class);
	}

	public Badge load( int badgeNumber ) {
		return super.load( badgeNumber );
	}

	public boolean delete( int badgeNumber ) {
		return super.delete( badgeNumber );
	}

	public boolean delete(Badge entity) {
		if ( entity != null ) {
			return super.delete( entity.getBadgeNumber() );
		}
		return false ;
	}

}
