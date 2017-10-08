package com.wilkestech.rental.serviceimpl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wilkestech.rental.domain.Property;
import com.wilkestech.rental.domain.dto.PropertyDTO;
import com.wilkestech.rental.domain.repository.PropertyRepository;
import com.wilkestech.rental.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService{

	@Inject
	private PropertyRepository propertyRepository;
	
	@Override
	@Transactional
	public Long createProperty(PropertyDTO propertydto) {
		Property property = propertyRepository.save(new Property(propertydto));
		return property.getId();
	}

}
