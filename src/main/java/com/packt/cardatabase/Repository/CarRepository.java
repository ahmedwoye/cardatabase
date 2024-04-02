package com.packt.cardatabase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.packt.cardatabase.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	// Fetch Cars by brand and model
	
	//List<Car> findByBrandAndModel (String brand, String model);
	
	
	//Fetch Cars by Brand or color
	
	//List<Car> findByBrandOrColor(String brand, String color);
	
	
	//Fetch Cars by brand and sort by year
	
	//List<Car> findBrandOrderByModelYearAsc(String brand);
	
	
	
	
}
