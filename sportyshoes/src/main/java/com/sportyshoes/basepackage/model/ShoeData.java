package com.sportyshoes.basepackage.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity annotation defines that a class can be mapped to a table. 
//And that is it, it is just a marker, like for example Serializable interface.
@Entity
@Table(name="shoelist")
public class ShoeData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long id;
	public String shoeName;
	public String description;
	public String price;
	public String size;
	public String userGroup;
	public String color;
	
	public ShoeData() {
		super();
	}
	
	public ShoeData(int id, String shoeName, String description, String price, String size, String userGroup,
			String color) {
		super();
		this.id = id;
		this.shoeName = shoeName;
		this.description = description;
		this.price = price;
		this.size = size;
		this.userGroup = userGroup;
		this.color = color;
	}
	
	
	public long getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getShoeName() {
		return shoeName;
	}

	public void setShoeName(String shoeName) {
		this.shoeName = shoeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getUserGroup() {
		return userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
