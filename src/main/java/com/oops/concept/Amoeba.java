package com.oops.concept;

public class Amoeba extends Shape{
	
	public void rotate()
	{
		System.out.println("rotate in Amoeba Class");
	}
	
	public void playSound()
	{
		System.out.println("playSound in Amoeba Class");
	}
	
	public void rotate(String text)
	{
		System.out.println("rotate in Amoeba Class + method with parameter :" + text);
	}
}
