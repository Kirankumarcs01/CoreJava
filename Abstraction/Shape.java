package edu.svit.sf04java.Abstraction;

public abstract class Shape {
	
	float area;
	
	//abstract method
	public abstract float calculateArea();
	
	
	//non abstract method
	public void display() {
		System.out.println("area of the shape:"+area);
	}

}
