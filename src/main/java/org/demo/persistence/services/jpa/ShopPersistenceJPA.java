
package org.demo.persistence.services.jpa;

import org.demo.bean.Shop ;
import org.demo.persistence.commons.jpa.GenericJpaService;
import org.demo.persistence.services.ShopPersistence;

/**
 * JPA implementation for basic persistence operations ( entity "Shop" )
 * 
 * @author Telosys Tools Generator
 *
 */
public class ShopPersistenceJPA extends GenericJpaService<Shop, String> implements ShopPersistence {

	/**
	 * Constructor
	 */
	public ShopPersistenceJPA() {
		super(Shop.class);
	}

	public Shop load( String code  ) {
		return super.load(  code  );
	}

	public boolean delete( String code  ) {
		return super.delete(  code  );
	}

	public boolean delete(Shop entity) {
		if ( entity != null ) {
			return super.delete(  entity.getCode()  );		
		}
		return false ;
	}

}
