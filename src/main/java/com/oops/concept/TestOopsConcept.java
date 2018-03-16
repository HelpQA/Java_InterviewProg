package com.oops.concept;

public class TestOopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Amoeba a = new Amoeba();
		a.rotate();
		a.playSound();
		a.rotate("Sahil Chaudhary");
		
		Shape s = new Amoeba();
		s.rotate();
		s.playSound();
		
		Square square = new Square();
		square.rotate();
		square.playSound();
		
		Circle obj=new Circle();
		obj.setRadius(4);
		obj.calculateArea();
		obj.displayDetails();
		
		//Only Those method can be accessed which are in Shape Class
		Shape obj1=new Circle();
		obj1.displayDetails();
		
		//This will give Compiler Error because claculateArea is not in Shape Class
		Shape obj2=new Circle();
		//obj2.calculateArea();
		obj2.displayDetails();
		
		Circle obj3=new Circle();
		Shape obj4=obj3;
		
		Shape shape = new Shape();
		shape.rotate();

	}

}
