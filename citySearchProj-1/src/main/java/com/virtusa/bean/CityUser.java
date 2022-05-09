package com.virtusa.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cityuser")
public class CityUser {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length=1000)
    private String Name;
    @Column(length=1000)
    private String Password;
    @Column(length=1000)
    private String Email;
    @Column(length=1000)
    private String Address;
    @Column(length=1000)
    private String Country;
    @Column(length=1000)
    private String Contact;
    
    public CityUser() {
    	super();
    }

	public int getid() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String Password) {
		this.Password = Password;
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

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		this.Country = Country;
	}

	public String getContact() {
		return Contact;
	}

	public void setContact(String Contact) {
		this.Contact = Contact;
	}
    
}
