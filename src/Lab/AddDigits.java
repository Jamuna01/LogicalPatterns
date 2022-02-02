//3.Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
package Lab;

import java.util.Scanner;

public class AddDigits
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter a number between 0 to 1000: ");
		int number = console.nextInt();
		
		int value;
		value = number;
		if(value <= 0 || value >= 1000)
		{
			System.out.println("Invalid Input..");
			console.close();
			return;
		}
		//567
		int sum = 0;
		while(value > 0)
		{
			int remainder = value%10;
			sum += remainder;
			value = value/10;
			
		}
		System.out.println("sum of digits from " + number+ " is: " + sum);
	}
}
