package com.packt.cardatabase.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packt.cardatabase.Repository.CarRepository;
import com.packt.cardatabase.domain.Car;

@RestController
public class CarController {
	
	
	private final CarRepository repository; 
	
	public CarController(CarRepository repository) {
		this.repository = repository;
	}
	
	
	
	@GetMapping("/cars")
	public Iterable<Car> getAllCars(){
		return repository.findAll();
	}

}
