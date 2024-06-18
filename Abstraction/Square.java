package edu.svit.sf04java.Abstraction;

public class Square extends Shape{
	
	float side;

	/**
	 * @param side
	 */
	public Square(float side) {
		this.side = side;
	}

	public float calculateArea()
	{
		return area = side*side;
	}

	

	
	

}
