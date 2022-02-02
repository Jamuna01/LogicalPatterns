/*
 * 9. Write a java program that 
 */
package Lab;

import java.util.Scanner;

public class Question9
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter first integer value: ");
		int first = console.nextInt();
		
		System.out.println("Enter second integer value: ");
		int second = console.nextInt();
		
		int sum = first + second;
		System.out.println("Sum is: " + sum);
		
		int diff = first - second;
		System.out.println("Subtract is: " + diff);
		
		int prod = first * second;
		System.out.println("Product is: " + prod);
		
//		int max = Math.max(first, second);
//		int min = Math.min(first, second);
		int max;
		int min;
		if(first>second)
		{
			max = first;
			System.out.println("Max is: " + max);
			min = second;
			System.out.println("Min is: " + min);
		}
		else
		{
			max = second;
			min = first;
			System.out.println("Max is: " + max);
			System.out.println("Min is: " + min);
		}
		
		
	
		
	}
}
