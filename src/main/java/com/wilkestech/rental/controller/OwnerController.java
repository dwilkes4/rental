package com.wilkestech.rental.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wilkestech.rental.domain.dto.OwnerDTO;
import com.wilkestech.rental.service.OwnerService;

@Controller
@ControllerAdvice
@RequestMapping("/owner")
public class OwnerController {

	@Inject
	private OwnerService ownerService;
	
	@RequestMapping(value = "/create", method=RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public Long create(@RequestBody OwnerDTO owner) {
		return ownerService.createOwner(owner);
	}
	
	@RequestMapping(value = "/{id}", method=RequestMethod.GET)
	@ResponseBody
	public OwnerDTO fineOne(@PathVariable("id") Long id) {
		return ownerService.findOwner(id);
	}
}
