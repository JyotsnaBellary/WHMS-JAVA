package com.bosch.whm.model;

public class Product {

	private int productCode;
	private String name;	
	private int currentStock;
	private Dimension dimension;
	private double weight;
	public Product(){}
	
	//Created Parameterized constructor
	public Product(int productCode, String name, int currentStock, Dimension dimension, double weight) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.setCurrentStock(currentStock);
		this.dimension = dimension;
		this.weight = weight;
	}
	//Created getter setter with toString
	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	







}







