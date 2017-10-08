package com.wilkestech.rental.domain;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.wilkestech.rental.domain.dto.OwnerDTO;

@Entity
public class Owner {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String firstName;
	
	private String middleName;
	
	private String lastName;
	
	@OneToMany(mappedBy="owner")
	private Set<Property> properties;

	public Owner() {};
	
	public Owner(OwnerDTO dto) {
		this.id = dto.getId();
		this.firstName = dto.getFirstName();
		this.middleName = dto.getMiddleName();
		this.lastName = dto.getLastName();
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

	public Set<Property> getProperties() {
		return properties;
	}

	public void setProperties(Set<Property> properties) {
		this.properties = properties;
	}
	
	
}
