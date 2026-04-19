package com.manu.inventory.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProductDTO {
	private Long id;
	
	@NotBlank(message = "Name is Required")
	private String name;
	
	private String description;
	
	@NotNull(message = "Price is Required")
	@Positive(message = "The price must be greater than 0")
	private double price;
	
	@NotNull(message = "Quantity is Required")
	@Min(message = "Quantity cannot be negative", value = 0)
	private int quantity;
	
	
	
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
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
