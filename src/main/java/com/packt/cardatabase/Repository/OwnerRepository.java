package com.packt.cardatabase.Repository;

import org.springframework.data.repository.CrudRepository;

import com.packt.cardatabase.domain.Owner;

public interface OwnerRepository extends CrudRepository <Owner, Long> {

}
