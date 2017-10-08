package com.wilkestech.rental.domain.dto;

import java.util.ArrayList;
import java.util.List;

import com.wilkestech.rental.domain.Owner;
import com.wilkestech.rental.domain.Property;

public class OwnerDTO {

	private Long id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	private List<PropertyDTO> properties = new ArrayList<PropertyDTO>();

	public OwnerDTO() {};
	
	public OwnerDTO(Owner owner) {
		this.id = owner.getId();
		this.firstName = owner.getFirstName();
		this.middleName = owner.getMiddleName();
		this.lastName = owner.getLastName();
		for(Property prop : owner.getProperties()) {
			this.properties.add(new PropertyDTO(prop));
		}
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List<PropertyDTO> getProperties() {
		return properties;
	}

	public void setProperties(List<PropertyDTO> properties) {
		this.properties = properties;
	}
}
