package com.ss.dpitcher.dec08.shapes;

/**
 * 
 * @author David Pitcher
 *
 */
public class Circle implements Shape
{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double calculateArea()
	{
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void display()
	{
		//TODO
	}
}
