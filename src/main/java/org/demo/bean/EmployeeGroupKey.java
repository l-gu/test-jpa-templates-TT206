/*
 * Created on 2 juil. 2013 ( Time 09:44:49 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
package org.demo.bean;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Composite primary key for entity "EmployeeGroup" ( stored in table "EMPLOYEE_GROUP" )
 *
 * @author Telosys Tools Generator
 *
 */
 @Embeddable
public class EmployeeGroupKey implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY KEY ATTRIBUTES 
    //----------------------------------------------------------------------
    @Column(name="EMPLOYEE_CODE", nullable=false, length=4)
    private String     employeeCode ;
    
    @Column(name="GROUP_ID", nullable=false)
    private short      groupId      ;
    

    //----------------------------------------------------------------------
    // CONSTRUCTORS
    //----------------------------------------------------------------------
    public EmployeeGroupKey()
    {
        super();
    }

    public EmployeeGroupKey( String employeeCode, short groupId )
    {
        super();
        this.employeeCode = employeeCode ;
        this.groupId = groupId ;
    }
    
    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR KEY FIELDS
    //----------------------------------------------------------------------
    public void setEmployeeCode( String value )
    {
        this.employeeCode = value;
    }
    public String getEmployeeCode()
    {
        return this.employeeCode;
    }

    public void setGroupId( short value )
    {
        this.groupId = value;
    }
    public short getGroupId()
    {
        return this.groupId;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
		StringBuffer sb = new StringBuffer(); 
		sb.append(employeeCode); 
		sb.append("|"); 
		sb.append(groupId); 
        return sb.toString();
    }

}
