package com.pojo;

import java.math.BigDecimal;

public class Book {

	private Integer id;
	private String name;
	private String author;
	private BigDecimal price;
	private Integer sales;
	private Integer stock;
	public Book() {
		super();
	}
	public Book(Integer id, String name, String author, BigDecimal price, Integer sales, Integer stock) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.sales = sales;
		this.stock = stock;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public BigDecimal getPrice() {
		if (price == null) {
			return new BigDecimal(0);
		}
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getSales() {
		if (sales == null) {
			return 0;
		}
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public Integer getStock() {
		if (stock == null) {
			return 0;
		}
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + ", sales=" + sales
				+ ", stock=" + stock + "]";
	}

}
