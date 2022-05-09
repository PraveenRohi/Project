package com.virtusa.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="cityclassified")
public class CityClassified {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(length=1000)
    private String Buysell;
    @Column(length=1000)
    private String Name;
    @Column(length=1000)
    private String Description;
    
    
    public CityClassified() {
    	super();
    }
    public int getid() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBuysell() {
		return Buysell;
	}
	public void setBuysell(String Buysell) {
		this.Buysell = Buysell;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String Description) {
		this.Description = Description;
	}
	

    
}
