package com.bosch.whm.model;

public class Dimension {
	
    private double length;
     private double width;
      private double height;
      
      //Created Parameterized constructor
	
      public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Dimension(){}

	public Dimension(double length, double width, double height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

    //Create Parameterized constructor
 
    //Create getter setter with toString

	
}


