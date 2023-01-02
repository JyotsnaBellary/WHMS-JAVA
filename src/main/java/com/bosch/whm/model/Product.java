package com.bosch.whm.model;
public class Product {

	private int productCode;
	private String name;	
	private int currentStock;
	private double dimension;
	private double weight;
	public Product(){}
	
	//Created Parameterized constructor
	public Product(int productCode, String name, int currentStock, double dimension, double weight) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.setCurrentStock(currentStock);
		this.dimension = dimension;
		this.weight = weight;
	}
	public Product(int i, String string, int j, Dimension dimension2, double d) {
		// TODO Auto-generated constructor stub
	}

	//Created getter setter with toString
	public int getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(int currentStock) {
		this.currentStock = currentStock;
	}

	public int getProductCode() {
		return productCode;
	}

	public void setProductCode(int productCode) {
		this.productCode = productCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDimension() {
		return dimension;
	}

	public void setDimension(double dimension) {
		this.dimension = dimension;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	







}







