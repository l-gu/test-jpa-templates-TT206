/*
 * Created on 2 juil. 2013 ( Time 09:44:49 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
// This Bean has a composite Primary Key  


package org.demo.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Persistent class for entity stored in table "EMPLOYEE_GROUP"
 *
 * @author Telosys Tools Generator
 *
 */
@XmlRootElement  // JAXB annotation for REST Web Services
@XmlAccessorType(XmlAccessType.PROPERTY) // JAXB accessor = getter/setter pair
@Entity
@Table(name="EMPLOYEE_GROUP", schema="ROOT" )
// Define named queries here
// @NamedQueries ( {
//  @NamedQuery ( name="EmployeeGroup.query1", query="SELECT x FROM EmployeeGroup x WHERE  " ),
//  @NamedQuery ( name="EmployeeGroup.query2", query="SELECT x FROM EmployeeGroup x WHERE  " )
// } )
public class EmployeeGroup implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( EMBEDDED IN AN EXTERNAL CLASS )  
    //----------------------------------------------------------------------
	@EmbeddedId
    private EmployeeGroupKey compositePrimaryKey ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public EmployeeGroup()
    {
		super();
		this.compositePrimaryKey = new EmployeeGroupKey();       
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE COMPOSITE KEY 
    //----------------------------------------------------------------------
    public void setEmployeeCode( String employeeCode )
    {
        this.compositePrimaryKey.setEmployeeCode( employeeCode ) ;
    }
    public String getEmployeeCode()
    {
        return this.compositePrimaryKey.getEmployeeCode() ;
    }
    public void setGroupId( short groupId )
    {
        this.compositePrimaryKey.setGroupId( groupId ) ;
    }
    public short getGroupId()
    {
        return this.compositePrimaryKey.getGroupId() ;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------

    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
        StringBuffer sb = new StringBuffer(); 
        if ( compositePrimaryKey != null ) {  
            sb.append(compositePrimaryKey.toString());  
        }  
        else {  
            sb.append( "(null-key)" );  
        }  
        sb.append("|"); 
        return sb.toString(); 
    }

}
