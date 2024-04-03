package com.packt.cardatabase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardatabase.Repository.CarRepository;
import com.packt.cardatabase.Repository.OwnerRepository;
import com.packt.cardatabase.domain.Car;
import com.packt.cardatabase.domain.Owner;

 @SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	 
	 
	 private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	
	
	 
	 private final CarRepository repository;
	 private final OwnerRepository orepository;
	 
	 public CardatabaseApplication (CarRepository repository, OwnerRepository orepository) {
		this.repository = repository;
		this.orepository = orepository;
		 
	 }


	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		
		logger.info("Application started");
		System.out.print("We go reach there inshaAllahu!");
		
		
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		//Add owner objects and save these to db
		
		Owner owner1 = new Owner("John" , "Johnson");
		Owner owner2 = new Owner("Mary" , "Robinson");
		orepository.saveAll(Arrays.asList(owner1,owner2));

		
		repository.save(new Car("Ford","Mustang", "Red","ADF-1121", 2023, 59000, owner1));
		repository.save(new Car("Nissan","Leaf", "Blue","ADF-1121", 2022, 69000, owner2));
		repository.save(new Car("Toyota","Prius", "Silver","ADF-1121", 2024, 39000, owner2));
		
		
		//Fetch all cars and log to console
		
		for(Car car: repository.findAll()) { 
			logger.info("brand: {}, model: {}", car.getClass(), car.getModel());
		}

		
	}

}
