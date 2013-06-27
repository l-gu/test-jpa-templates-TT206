package org.demo.persistence.services.fake;

import java.util.List;
import java.util.Map;

import org.demo.bean.Book ;
import org.demo.persistence.commons.fake.GenericFakeService;
import org.demo.persistence.services.BookPersistence;

/**
 * Fake persistence service implementation ( entity "Book" )
 *
 * @author Telosys Tools Generator
 */
public class BookPersistenceFAKE extends GenericFakeService<Book> implements BookPersistence {

	public BookPersistenceFAKE () {
		super(Book.class);
	}
	
	protected Book buildEntity(int index) {
		Book entity = new Book();
		// Init fields with mock values
		entity.setId( nextInteger() ) ;
		entity.setPublisherId( nextInteger() ) ;
		entity.setAuthorId( nextInteger() ) ;
		entity.setIsbn( nextString() ) ;
		entity.setTitle( nextString() ) ;
		entity.setPrice( nextBigDecimal() ) ;
		entity.setQuantity( nextInteger() ) ;
		entity.setDiscount( nextInteger() ) ;
		entity.setAvailability( nextShort() ) ;
		entity.setBestSeller( nextShort() ) ;
		return entity ;
	}
	
	
	public boolean delete(Book entity) {
		log("delete ( Book : " + entity + ")" ) ;
		return true;
	}

	public boolean delete( int id  ) {
		log("delete ( PK )") ;
		return true;
	}

	public void insert(Book entity) {
		log("insert ( Book : " + entity + ")" ) ;
	}

	public Book load( int id  ) {
		log("load ( PK )") ;
		return buildEntity(1) ; 
	}

	public List<Book> loadAll() {
		log("loadAll()") ;
		return buildList(40) ;
	}

	public List<Book> loadByNamedQuery(String queryName) {
		log("loadByNamedQuery ( '" + queryName + "' )") ;
		return buildList(20) ;
	}

	public List<Book> loadByNamedQuery(String queryName, Map<String, Object> queryParameters) {
		log("loadByNamedQuery ( '" + queryName + "', parameters )") ;
		return buildList(10) ;
	}

	public Book save(Book entity) {
		log("insert ( Book : " + entity + ")" ) ;
		return entity;
	}

	public List<Book> search(Map<String, Object> criteria) {
		log("search (criteria)" ) ;
		return buildList(15) ;
	}

}
