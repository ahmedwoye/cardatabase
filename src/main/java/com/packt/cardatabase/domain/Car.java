package com.packt.cardatabase.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
 

@Entity

public class Car {
	
	
	
 		// TODO Auto-generated constructor stub
	

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String brand, model, color, registrationNumber;
	
	private int modelYear, price;
	
	
	public Car() {
		
		
	}
	
	
	public Car(String brand, String model, String color, String registrationNumber, int modelYear, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.registrationNumber = registrationNumber;
		this.modelYear = modelYear;
		this.price = price;
	}
	

	public Long getId() {
		return id;
	}

 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public int getModelYear() {
		return modelYear;
	}

	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	
	
	

}