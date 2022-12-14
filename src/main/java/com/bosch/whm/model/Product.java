package com.bosch.whm.model;

public class Product {

	private int productCode;
<<<<<<< HEAD
	private String name;	
=======
	private String name;
	public Product(int productCode, String name, int currentStock, Dimension dimension, double weight) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.currentStock = currentStock;
		this.dimension = dimension;
		this.weight = weight;
	}



>>>>>>> e4ee32a185d0f9a8a9343875a6d3c42962cda0a3
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







