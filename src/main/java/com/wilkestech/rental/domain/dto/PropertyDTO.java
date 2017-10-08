package com.wilkestech.rental.domain.dto;

import java.util.ArrayList;
import java.util.List;

import com.wilkestech.rental.domain.Image;
import com.wilkestech.rental.domain.Property;

public class PropertyDTO {

	private Long id;
    
	private String name;
	
    private Long owner;
    
    private List<ImageDTO> images = new ArrayList<ImageDTO>();

    public PropertyDTO() {};
    
    public PropertyDTO(Property property) {
    	this.id = property.getId();
    	this.name = property.getName();
    	this.owner = property.getOwner().getId();
    	for(Image image : property.getImages()) {
    		images.add(new ImageDTO(image));
    	}
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

	public List<ImageDTO> getImages() {
		return images;
	}

	public void setImages(List<ImageDTO> images) {
		this.images = images;
	}
	
}
