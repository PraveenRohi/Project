package com.virtusa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="citydetails")
public class CityDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length=1000)
    private String Name;
    @Column(length=1000)
    private String Category;
    @Column(length=1000)
    private String Email;
    @Column(length=1000)
    private String Address;
    @Column(length=1000)
    private String City;
    @Column(length=1000)
    private String Contact;
    
    public CityDetails() {
    	super();
    }
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String Category) {
		this.Category = Category;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String Address) {
		this.Address = Address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String City) {
		this.City = City;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String Contact) {
		this.Contact = Contact;
	}
    
    
}
