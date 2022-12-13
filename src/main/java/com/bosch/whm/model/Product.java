package com.bosch.whm.model;

public class Product {

	private int productCode;
	private String name;
	public Product(int productCode, String name, int currentStock, Dimension dimension, double weight) {
		super();
		this.productCode = productCode;
		this.name = name;
		this.currentStock = currentStock;
		this.dimension = dimension;
		this.weight = weight;
	}



	private int currentStock;
	private Dimension dimension;
	private double weight;



	public Product(){}

	//Create Parameterized constructor

	//Create getter setter with toString







}







