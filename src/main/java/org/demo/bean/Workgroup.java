/*
 * Java bean class for entity table WORKGROUP 
 * Created on 26 juin 2013 ( Time 12:07:22 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import javax.persistence.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for entity stored in table "WORKGROUP"
 *
 * @author Telosys Tools Generator
 *
 */
@XmlRootElement  // JAXB annotation for REST Web Services
@XmlAccessorType(XmlAccessType.PROPERTY) // JAXB accessor = getter/setter pair
@Entity
@Table(name="WORKGROUP", schema="ROOT" )
// Define named queries here
// @NamedQueries ( {
//  @NamedQuery ( name="Workgroup.query1", query="SELECT x FROM Workgroup x WHERE  " ),
//  @NamedQuery ( name="Workgroup.query2", query="SELECT x FROM Workgroup x WHERE  " )
// } )
public class Workgroup implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="ID", nullable=false)
    private short      id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="NAME", nullable=false, length=40)
    private String     name         ;

    @Column(name="DESCRIPTION", nullable=false, length=600)
    private String     description  ;

    @Temporal(TemporalType.DATE)
    @Column(name="CREATION_DATE", nullable=false)
    private Date       creationDate ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Workgroup()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( short id )
    {
        this.id = id ;
    }
    public short getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : NAME ( VARCHAR ) 
    public void setName( String name )
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    //--- DATABASE MAPPING : DESCRIPTION ( VARCHAR ) 
    public void setDescription( String description )
    {
        this.description = description;
    }
    public String getDescription()
    {
        return this.description;
    }

    //--- DATABASE MAPPING : CREATION_DATE ( DATE ) 
    public void setCreationDate( Date creationDate )
    {
        this.creationDate = creationDate;
    }
    public Date getCreationDate()
    {
        return this.creationDate;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
        StringBuffer sb = new StringBuffer(); 
        sb.append(id); 
        sb.append("|"); 
        sb.append(name); 
        sb.append( "|" ); 
        sb.append(description); 
        sb.append( "|" ); 
        sb.append(creationDate); 
        return sb.toString(); 
    }

}
