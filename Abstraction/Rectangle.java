package edu.svit.sf04java.Abstraction;

public class Rectangle extends Shape{
	float length,width;
	public Rectangle(float length, float width)
	{
		super();
		this.length = length;
		this.width = width;
		
	}
	public float calculateArea()
	{
		return area = length*width;
	}

}
