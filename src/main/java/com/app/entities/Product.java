package com.app.entities;
import javax.persistence.*;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "prod_name",length = 20)
	private String prodName;
	@Column(name = "quantity",nullable = false)
	private int quantity;
	private double price;
	@Column(name = "description",length = 100)
	private String description;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String prodName, int quantity, double price, String description) {
		super();
		this.prodName = prodName;
		this.quantity = quantity;
		this.price = price;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", prodName=" + prodName + ", quantity=" + quantity + ", price=" + price
				+ ", description=" + description + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
	

}
