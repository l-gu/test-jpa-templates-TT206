package org.demo.samples.persistence.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.demo.persistence.PersistenceConfig;

public class SampleNativeJPA {

	   static public void main(String[] args)
	    {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory( PersistenceConfig.JPA_PERSISTENCE_UNIT_NAME, null );

	        EntityManager em = emf.createEntityManager();
	        EntityTransaction tx = em.getTransaction();
	        try
	        {
	            tx.begin();

	            // Insert your JPA operations here
	            
	            /**
	            Author o = em.find(Author.class, 1);
	            if ( o != null ) {
	            	System.out.println("FOUND : " + o );
	            }	
	            else {
	            	System.out.println("NOT FOUND");
	            }
	            **/

	            tx.commit();
	        }
	        catch (Exception e)
	        {
	        	System.out.println("ERROR : " + e.toString() );
	        	e.printStackTrace();
	            return;
	        }
	        finally
	        {
	            if (tx.isActive())
	            {
	                tx.rollback();
	            }
	            em.close();
	            emf.close();
	        }
	    }
}
