/*
 * Created on 28 juin 2013 ( Time 18:59:52 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for entity stored in table "SYNOPSIS"
 *
 * @author Telosys Tools Generator
 *
 */
@XmlRootElement  // JAXB annotation for REST Web Services
@XmlAccessorType(XmlAccessType.PROPERTY) // JAXB accessor = getter/setter pair
@Entity
@Table(name="SYNOPSIS", schema="ROOT" )
// Define named queries here
// @NamedQueries ( {
//  @NamedQuery ( name="Synopsis.query1", query="SELECT x FROM Synopsis x WHERE  " ),
//  @NamedQuery ( name="Synopsis.query2", query="SELECT x FROM Synopsis x WHERE  " )
// } )
public class Synopsis implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="BOOK_ID", nullable=false)
    private int        bookId       ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="SYNOPSIS")
    private String     synopsis     ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="BOOK_ID", referencedColumnName="ID", insertable=false, updatable=false)
    private Book       book        ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Synopsis()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setBookId( int bookId )
    {
        this.bookId = bookId ;
    }
    public int getBookId()
    {
        return this.bookId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : SYNOPSIS ( LONG VARCHAR ) 
    public void setSynopsis( String synopsis )
    {
        this.synopsis = synopsis;
    }
    public String getSynopsis()
    {
        return this.synopsis;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setBook( Book book )
    {
        this.book = book;
    }
    public Book getBook()
    {
        return this.book;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
        StringBuffer sb = new StringBuffer(); 
        sb.append(bookId); 
        sb.append("|"); 
        return sb.toString(); 
		// synopsis is not in toString because it's a "long text" field
    }

}
