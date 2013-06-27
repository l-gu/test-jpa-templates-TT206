
package org.demo.persistence.services.jpa;

import org.demo.bean.Workgroup ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.WorkgroupPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Workgroup" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class WorkgroupPersistenceJPA extends GenericJpaService<Workgroup, Short> implements WorkgroupPersistence {

	/**
	 * Constructor
	 */
	public WorkgroupPersistenceJPA() {
		super(Workgroup.class);
	}

	public Workgroup load( short id  ) {
		return super.load(  id  );
	}

	public boolean delete( short id  ) {
		return super.delete(  id  );
	}

	public boolean delete(Workgroup entity) {
		if ( entity != null ) {
			return super.delete(  entity.getId()  );		
		}
		return false ;
	}

}
