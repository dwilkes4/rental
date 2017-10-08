package com.wilkestech.rental.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.wilkestech.rental.domain.dto.ImageDTO;

@Entity
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	private Long imageSize;
	
	private byte[] imageData;
	
	@ManyToOne
    private Property property;

	public Image() {};
	
	public Image(ImageDTO dto) {
		this.id = dto.getId();
		this.name = dto.getName();
		this.imageSize = dto.getImageSize();
		if(dto.getProperty() != null) {
			this.property = new Property();
			this.property.setId(dto.getProperty());
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

	public Long getImageSize() {
		return imageSize;
	}

	public void setImageSize(Long imageSize) {
		this.imageSize = imageSize;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

}
