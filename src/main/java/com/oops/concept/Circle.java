package com.oops.concept;

public class Circle extends Shape{
	protected double radius;
	public double area;
	
	public void setRadius(int radius){
		this.radius=radius;
	}
	public void calculateArea(){
		area=3.14*radius*radius;

	}
	public void displayDetails(){
		System.out.println("Area of the circle is :"+area);
	}

}
