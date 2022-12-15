package com.sportyshoes.basepackage.model;

public class ShoeData {
	
	public int id;
	public String shoeName;
	public String description;
	public int price;
	public String size;
	public String userGroup;
	public String color;
	
	public ShoeData(int id, String shoeName, String description, int price, String size, String userGroup,
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
	
	
	public ShoeData() {
		super();
	}


	public int getId() {
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
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
