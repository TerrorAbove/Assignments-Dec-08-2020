package com.ss.dpitcher.dec08.shapes;

/**
 * 
 * @author David Pitcher
 *
 */
public class Rectangle implements Shape
{
	private double width, height;
	
	public Rectangle(double width, double height)
	{
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calculateArea()
	{
		return width * height;
	}

	@Override
	public void display()
	{
		//TODO
	}
}
