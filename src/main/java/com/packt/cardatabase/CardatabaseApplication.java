package com.packt.cardatabase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.packt.cardatabase.Repository.CarRepository;
import com.packt.cardatabase.domain.Car;

 @SpringBootApplication
public class CardatabaseApplication implements CommandLineRunner {
	 
	 
	 private static final Logger logger = LoggerFactory.getLogger(CardatabaseApplication.class);
	
	
	 
	 private final CarRepository repository;
	 public CardatabaseApplication (CarRepository repository) {
		this.repository = repository;
		 
	 }


	public static void main(String[] args) {
		SpringApplication.run(CardatabaseApplication.class, args);
		
		logger.info("Application started");
		System.out.print("We go reach there!");
		
		
	}




	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		repository.save(new Car("Ford","Mustang", "Red","ADF-1121", 2023, 59000));
		repository.save(new Car("Nissan","Leaf", "Blue","ADF-1121", 2022, 69000));
		repository.save(new Car("Toyota","Prius", "Silver","ADF-1121", 2024, 39000));
		
		
		//Fetch all cars and log to console
		
		for(Car car: repository.findAll()) { 
			logger.info("brand: {}, model: {}", car.getClass(), car.getModelYear());
		}

		
	}

}
