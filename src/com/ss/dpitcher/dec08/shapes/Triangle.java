package com.ss.dpitcher.dec08.shapes;

/**
 * 
 * @author David Pitcher
 *
 */
public class Triangle implements Shape
{
	private double[] sideLengths = new double[3];//array of side lengths
	
	public Triangle(double sideLength0, double sideLength1, double sideLength2)
	{
		sideLengths[0] = sideLength0;
		sideLengths[1] = sideLength1;
		sideLengths[2] = sideLength2;
	}
	
	@Override
	public double calculateArea()
	{
		double halfPerimeter = 0.5 * (sideLengths[0] + sideLengths[1] + sideLengths[2]);
		
		//we can use Heron's formula to get the area from the side lengths.
		//it will be an approximation with precision of Double
		return Math.sqrt(halfPerimeter * (halfPerimeter - sideLengths[0]) * (halfPerimeter - sideLengths[1]) * (halfPerimeter - sideLengths[2]));
	}

	@Override
	public void display()
	{
		//TODO
	}
}
