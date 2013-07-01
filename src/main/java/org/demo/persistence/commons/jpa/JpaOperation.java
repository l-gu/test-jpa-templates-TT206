package org.demo.persistence.commons.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

public interface JpaOperation {

	public Object exectue(EntityManager em) throws PersistenceException;
	
}
