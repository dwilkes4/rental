package com.wilkestech.rental.domain.dto;

import com.wilkestech.rental.domain.Image;

public class ImageDTO {

	private Long id;
    
	private String name;
	
    private Long property;
    
    private Long imageSize;

    public ImageDTO() {};
    
    public ImageDTO(Image image) {
    	this.id = image.getId();
    	this.name = image.getName();
    	this.imageSize = image.getImageSize();
    	if(image.getProperty() != null) {
    		this.property = image.getProperty().getId();
    	}
    }
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Long getProperty() {
		return property;
	}

	public void setProperty(Long property) {
		this.property = property;
	}

	public Long getImageSize() {
		return imageSize;
	}

	public void setImageSize(Long imageSize) {
		this.imageSize = imageSize;
	}
	
}
