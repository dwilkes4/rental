package com.wilkestech.rental.domain.dto;

import com.wilkestech.rental.domain.Property;

public class PropertyDTO {

	private Long id;
    
	private String name;
	
    private Long owner;

    public PropertyDTO() {};
    
    public PropertyDTO(Property property) {
    	this.id = property.getId();
    	this.name = property.getName();
    	this.owner = property.getOwner().getId();
    }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOwner() {
		return owner;
	}
	
	public void setOwner(Long owner) {
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
