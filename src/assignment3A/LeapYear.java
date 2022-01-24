//3. Write a program given year is leap or not?

package assignment3A;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{

		Scanner console = new Scanner(System.in);
		
		System.out.println("Please enter a year: ");
		int year = console.nextInt();
		
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
		{
			System.out.println("Given " + year + " year is a leap year");
		}
		else
		{
			System.out.println("Given " + year + " year is not a leap year");
		}

	}
}
