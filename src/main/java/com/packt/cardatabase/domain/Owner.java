package com.packt.cardatabase.domain;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Owner {
	
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long ownerid;
	
	private String firstname, surname;
	
	//@oneToMany annotation
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="owner")
	private List<Car> cars;
	
	
	public List<Car> getCars(){
		return cars;
	}
	
	public void setCars(List<Car> car) {
		this.cars = cars;
	}
	  //End of oneToMany Relationship
	public Owner() {
		
		
	}

	public Owner(String firstname, String surname) {
		super();
		this.firstname = firstname;
		this.surname = surname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Long getOwnerid() {
		return ownerid;
	}
	
	

}
