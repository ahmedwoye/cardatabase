package com.packt.cardatabase.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.packt.cardatabase.domain.Car;


@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> {
	
	// Fetch Cars by brand and model
	
	List<Car> findByBrand (@Param("brand") String brand);
	
	
	//Fetch Cars by Brand or color
	
	List<Car> findByColor(@Param("color") String color);
	
	
	//Fetch Cars by model year
	
	List<Car> findByModelYear(int modelYear);
	
	
	//Fetch cars by brand and model 
	List<Car> findByBrandAndModel (String brand, String model);
	
	
	//Fetch cars by brand or color
	List<Car> findByBrandOrColor(String brand, String color);
	
	//Fetch cars by brand and sort by year
	
	List<Car> findByBrandOrderByModelYearAsc(String brand);
	
	
	//Fetch cars by brand using SQL
	
	//@Query("select c from Car  c where c.brand = ? 1")
	//List<Car> findByBrand (String brand);
	
	
	@Query("select c from Car  c where c.brand like %?1 ")
	List<Car> findByBrandEndsWith(String brand);

 
	
	
	
	
	
}
