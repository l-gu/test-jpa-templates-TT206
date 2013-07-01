/*
 * Created on 28 juin 2013 ( Time 18:59:52 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.bean;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "Review" ( stored in table "REVIEW" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class ReviewKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="CUSTOMER_CODE", nullable=false, length=5)
    private String     customerCode ;
    
    @Column(name="BOOK_ID", nullable=false)
    private int        bookId       ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public ReviewKey()
    {
        super();
    }

    public ReviewKey( String customerCode, int bookId )
    {
        super();
        this.customerCode = customerCode ;
        this.bookId = bookId ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setCustomerCode( String value )
    {
        this.customerCode = value;
    }
    public String getCustomerCode()
    {
        return this.customerCode;
    }

    public void setBookId( int value )
    {
        this.bookId = value;
    }
    public int getBookId()
    {
        return this.bookId;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
		StringBuffer sb = new StringBuffer(); 
		sb.append(customerCode); 
		sb.append("|"); 
		sb.append(bookId); 
        return sb.toString();
    }

}
