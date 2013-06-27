package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Shop ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.ShopPersistence;

/**
 * Fake persistence service implementation ( entity "Shop" )
 *
 * @author Telosys Tools Generator
 */
public class ShopPersistenceFAKE extends GenericFakeService<Shop> implements ShopPersistence {

	public ShopPersistenceFAKE () {
		super(Shop.class);
	}
	
	protected Shop buildEntity(int index) {
		Shop entity = new Shop();
		// Init fields with mock values
		entity.setCode( nextString() ) ;
		entity.setName( nextString() ) ;
		entity.setAddress1( nextString() ) ;
		entity.setAddress2( nextString() ) ;
		entity.setZipCode( nextInteger() ) ;
		entity.setCity( nextString() ) ;
		entity.setCountryCode( nextString() ) ;
		entity.setPhone( nextString() ) ;
		entity.setEmail( nextString() ) ;
		entity.setExecutive( nextString() ) ;
		return entity ;
	}
	
	
	public boolean delete(Shop entity) {
		log("delete ( Shop : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( String code  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Shop entity) {
		log("insert ( Shop : " + entity + ")" ) ;
	}

	public Shop load( String code  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Shop> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Shop> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Shop> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Shop save(Shop entity) {
		log("insert ( Shop : " + entity + ")" ) ;
		return entity;
	}

	public List<Shop> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}