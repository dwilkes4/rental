package com.wilkestech.rental.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wilkestech.rental.domain.Property;
import com.wilkestech.rental.domain.dto.PropertyDTO;
import com.wilkestech.rental.service.PropertyService;

@Controller
@ControllerAdvice
@RequestMapping("/property")
public class PropertyController {

	@Inject
	private PropertyService propertyService;
	
	@RequestMapping(value = "/create", method=RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public Long create(@RequestBody PropertyDTO property) {
		return propertyService.createProperty(property);
	}
}
