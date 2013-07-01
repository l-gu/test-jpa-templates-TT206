/*
 * Created on 28 juin 2013 ( Time 18:59:52 )
 * Generated by Telosys Tools Generator ( version 2.0.5 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;

import java.util.Date;

import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Persistent class for entity stored in table "BOOK_ORDER"
 *
 * @author Telosys Tools Generator
 *
 */
@XmlRootElement  // JAXB annotation for REST Web Services
@XmlAccessorType(XmlAccessType.PROPERTY) // JAXB accessor = getter/setter pair
@Entity
@Table(name="BOOK_ORDER", schema="ROOT" )
// Define named queries here
// @NamedQueries ( {
//  @NamedQuery ( name="BookOrder.query1", query="SELECT x FROM BookOrder x WHERE  " ),
//  @NamedQuery ( name="BookOrder.query2", query="SELECT x FROM BookOrder x WHERE  " )
// } )
public class BookOrder implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="ID", nullable=false)
    private int        id           ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Temporal(TemporalType.DATE)
    @Column(name="DATE")
    private Date       date         ;

    @Column(name="STATE")
    private Integer    state        ;

	// "shopCode" (column "SHOP_CODE") is not defined by itself because used as FK in a link 
	// "customerCode" (column "CUSTOMER_CODE") is not defined by itself because used as FK in a link 
	// "employeeCode" (column "EMPLOYEE_CODE") is not defined by itself because used as FK in a link 


    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="SHOP_CODE", referencedColumnName="CODE", insertable=false, updatable=false)
    private Shop       shop        ;

    @ManyToOne
    @JoinColumn(name="EMPLOYEE_CODE", referencedColumnName="CODE", insertable=false, updatable=false)
    private Employee   employee    ;

    @ManyToOne
    @JoinColumn(name="CUSTOMER_CODE", referencedColumnName="CODE", insertable=false, updatable=false)
    private Customer   customer    ;

    @OneToMany(mappedBy="bookOrder", targetEntity=BookOrderItem.class)
    private List<BookOrderItem> listOfBookOrderItem;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public BookOrder()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( int id )
    {
        this.id = id ;
    }
    public int getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : DATE ( DATE ) 
    public void setDate( Date date )
    {
        this.date = date;
    }
    public Date getDate()
    {
        return this.date;
    }

    //--- DATABASE MAPPING : STATE ( INTEGER ) 
    public void setState( Integer state )
    {
        this.state = state;
    }
    public Integer getState()
    {
        return this.state;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setShop( Shop shop )
    {
        this.shop = shop;
    }
    public Shop getShop()
    {
        return this.shop;
    }

    public void setEmployee( Employee employee )
    {
        this.employee = employee;
    }
    public Employee getEmployee()
    {
        return this.employee;
    }

    public void setCustomer( Customer customer )
    {
        this.customer = customer;
    }
    public Customer getCustomer()
    {
        return this.customer;
    }

    @XmlTransient
    public void setListOfBookOrderItem( List<BookOrderItem> listOfBookOrderItem )
    {
        this.listOfBookOrderItem = listOfBookOrderItem;
    }
    public List<BookOrderItem> getListOfBookOrderItem()
    {
        return this.listOfBookOrderItem;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString()
    {
        StringBuffer sb = new StringBuffer(); 
        sb.append(id); 
        sb.append("|"); 
        sb.append(date); 
        sb.append( "|" ); 
        sb.append(state); 
        return sb.toString(); 
    }

}
