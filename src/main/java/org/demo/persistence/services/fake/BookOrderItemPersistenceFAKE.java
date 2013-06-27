package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.BookOrderItem ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.BookOrderItemPersistence;

/**
 * Fake persistence service implementation ( entity "BookOrderItem" )
 *
 * @author Telosys Tools Generator
 */
public class BookOrderItemPersistenceFAKE extends GenericFakeService<BookOrderItem> implements BookOrderItemPersistence {

	public BookOrderItemPersistenceFAKE () {
		super(BookOrderItem.class);
	}
	
	protected BookOrderItem buildEntity(int index) {
		BookOrderItem entity = new BookOrderItem();
		// Init fields with mock values
		entity.setBookOrderId( nextInteger() ) ;
		entity.setBookId( nextInteger() ) ;
		entity.setQuantity( nextInteger() ) ;
		entity.setPrice( nextBigDecimal() ) ;
		return entity ;
	}
	
	
	public boolean delete(BookOrderItem entity) {
		log("delete ( BookOrderItem : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int bookOrderId, int bookId  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(BookOrderItem entity) {
		log("insert ( BookOrderItem : " + entity + ")" ) ;
	}

	public BookOrderItem load( int bookOrderId, int bookId  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<BookOrderItem> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<BookOrderItem> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<BookOrderItem> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public BookOrderItem save(BookOrderItem entity) {
		log("insert ( BookOrderItem : " + entity + ")" ) ;
		return entity;
	}

	public List<BookOrderItem> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
