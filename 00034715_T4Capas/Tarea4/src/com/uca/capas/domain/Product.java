package com.uca.capas.domain;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	
	@Size(message="Debe poseer entre 1 y 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no pude ir vacío")
	private String name;

	@Size(message="Debe poseer entre 1 y 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no pude ir vacío")
	private String brand;
	
	@Size(message="Debe poseer entre 1 y 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no pude ir vacío")
	private String description;
	
	@Size(message="Longitud debe ser entre 1 y 30 caracteres", min=1, max=30)
	@NotEmpty(message="Este campo no pude ir vacío")
	private String category;
	
	@NotNull
	@Min(message="No pueden haber valores negativos", value=0)
	private double price;
	
	@Pattern(message="Formato no válido de fecha" , regexp="(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$")
	@NotEmpty(message="Este campo no pude ir vacío")
	private String date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
