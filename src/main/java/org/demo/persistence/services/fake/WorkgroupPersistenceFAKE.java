package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Workgroup ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.WorkgroupPersistence;

/**
 * Fake persistence service implementation ( entity "Workgroup" )
 *
 * @author Telosys Tools Generator
 */
public class WorkgroupPersistenceFAKE extends GenericFakeService<Workgroup> implements WorkgroupPersistence {

	public WorkgroupPersistenceFAKE () {
		super(Workgroup.class);
	}
	
	protected Workgroup buildEntity(int index) {
		Workgroup entity = new Workgroup();
		// Init fields with mock values
		entity.setId( nextShort() ) ;
		entity.setName( nextString() ) ;
		entity.setDescription( nextString() ) ;
		entity.setCreationDate( nextDate() ) ;
		return entity ;
	}
	
	
	public boolean delete(Workgroup entity) {
		log("delete ( Workgroup : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( short id  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Workgroup entity) {
		log("insert ( Workgroup : " + entity + ")" ) ;
	}

	public Workgroup load( short id  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Workgroup> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Workgroup> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Workgroup> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Workgroup save(Workgroup entity) {
		log("insert ( Workgroup : " + entity + ")" ) ;
		return entity;
	}

	public List<Workgroup> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
