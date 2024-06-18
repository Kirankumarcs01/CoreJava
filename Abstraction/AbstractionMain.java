package edu.svit.sf04java.Abstraction;

public class AbstractionMain {
	public static void main(String args[])
	{
		//Shape s =new Square();
		Shape sOne = new Square(2.5f);
		sOne.calculateArea();
		sOne.display();
		
		Shape sTwo = new Rectangle(12,13);
		sTwo.calculateArea();
		sTwo.display();
	}

}
