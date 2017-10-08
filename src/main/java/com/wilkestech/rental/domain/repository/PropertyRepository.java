package com.wilkestech.rental.domain.repository;

import org.springframework.data.repository.CrudRepository;

import com.wilkestech.rental.domain.Property;

public interface PropertyRepository extends CrudRepository<Property, Long> {

}
