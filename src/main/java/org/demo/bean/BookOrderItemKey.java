/*
 * Created on 28 juin 2013 ( Time 18:59:52 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.bean;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "BookOrderItem" ( stored in table "BOOK_ORDER_ITEM" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class BookOrderItemKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="BOOK_ORDER_ID", nullable=false)
    private int        bookOrderId  ;
    
    @Column(name="BOOK_ID", nullable=false)
    private int        bookId       ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public BookOrderItemKey()
    {
        super();
    }

    public BookOrderItemKey( int bookOrderId, int bookId )
    {
        super();
        this.bookOrderId = bookOrderId ;
        this.bookId = bookId ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setBookOrderId( int value )
    {
        this.bookOrderId = value;
    }
    public int getBookOrderId()
    {
        return this.bookOrderId;
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
		sb.append(bookOrderId); 
		sb.append("|"); 
		sb.append(bookId); 
        return sb.toString();
    }

}
