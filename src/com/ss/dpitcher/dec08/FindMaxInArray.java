package com.ss.dpitcher.dec08;

/**
 * 
 * @author David Pitcher
 *
 */
public class FindMaxInArray
{
	public static void main(String[] args)
	{
		int[][] array2D = new int[5][5];//initialize 2D array of size 5x5 with zeros
		
		//we will put random values for each entry
		for(int i = 0; i < array2D.length; i++)
		{
			for(int j = 0; j < array2D[i].length; j++)
			{
				int rand = -499 + (int)(Math.random() * 1000);//pick a number in the range [-499, 500]
				
				array2D[i][j] = rand;
				System.out.print("\t" + rand + " ");//display each number in the row, tabs for organization
			}
			System.out.println();//newline
		}
		System.out.println();
		
		int max = -499;//start as low as possible for the values in the array
		int r = -1;//this will store the row of the current max value
		int c = -1;//this will store the column of the current max value
		
		//now we will loop through again to find the max number
		for(int i = 0; i < array2D.length; i++)
		{
			for(int j = 0; j < array2D[i].length; j++)
			{
				int n = array2D[i][j];
				
				//if the current number is larger, we'll store it and record its position
				if(n > max)
				{
					max = n;
					r = i;
					c = j;
				}
			}
		}
		
		//display results
		System.out.println("The max number is " + max + " and its position is row " + (r+1) + ", column " + (c+1) + ".");
	}
}
