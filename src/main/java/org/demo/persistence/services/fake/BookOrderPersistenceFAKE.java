package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.BookOrder ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.BookOrderPersistence;

/**
 * Fake persistence service implementation ( entity "BookOrder" )
 *
 * @author Telosys Tools Generator
 */
public class BookOrderPersistenceFAKE extends GenericFakeService<BookOrder> implements BookOrderPersistence {

	public BookOrderPersistenceFAKE () {
		super(BookOrder.class);
	}
	
	protected BookOrder buildEntity(int index) {
		BookOrder entity = new BookOrder();
		// Init fields with mock values
		entity.setId( nextInteger() ) ;
		entity.setShopCode( nextString() ) ;
		entity.setCustomerCode( nextString() ) ;
		entity.setEmployeeCode( nextString() ) ;
		entity.setDate( nextDate() ) ;
		entity.setState( nextInteger() ) ;
		return entity ;
	}
	
	
	public boolean delete(BookOrder entity) {
		log("delete ( BookOrder : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int id  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(BookOrder entity) {
		log("insert ( BookOrder : " + entity + ")" ) ;
	}

	public BookOrder load( int id  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<BookOrder> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<BookOrder> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<BookOrder> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public BookOrder save(BookOrder entity) {
		log("insert ( BookOrder : " + entity + ")" ) ;
		return entity;
	}

	public List<BookOrder> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
