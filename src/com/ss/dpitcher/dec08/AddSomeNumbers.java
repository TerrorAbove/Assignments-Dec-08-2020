package com.ss.dpitcher.dec08;

/**
 * @author David Pitcher
 *
 */
public class AddSomeNumbers
{
	public static void main(String[] args)
	{
		double totalValue = 0;
		
		for(String string : args)//iterate through each String the user entered
		{
			double number = 0;//using type double because it will allow the most flexibility
			
			try
			{
				number = Double.parseDouble(string);//try to parse String as double
			}
			catch(NumberFormatException nfe)//if we cannot, terminate the program with error code, informing the user
			{
				System.out.println("One or more of the inputs were not numbers. Please try again.");
				System.exit(1);
			}
			
			totalValue += number;//accumulate the value
		}
		
		System.out.println("The sum is " + totalValue + ".");//print result
	}
}
