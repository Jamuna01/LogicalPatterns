//2. Write a program given number is odd number of not?

package assignment3A;

import java.util.Scanner;

public class FindOddNumber
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = console.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println(number + " is not odd number.");
		}
		else
		{
			System.out.println(number + " is odd number.");
		}
	}
}
