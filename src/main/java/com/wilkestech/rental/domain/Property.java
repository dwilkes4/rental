package com.wilkestech.rental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.wilkestech.rental.domain.dto.PropertyDTO;

@Entity
public class Property {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
    
	private String name;
	
	@ManyToOne
    private Owner owner;

	public Property() {};
	
	public Property(PropertyDTO dto) {
		this.id = dto.getId();
		this.name = dto.getName();
		this.owner = new Owner();
		this.owner.setId(dto.getOwner());
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}