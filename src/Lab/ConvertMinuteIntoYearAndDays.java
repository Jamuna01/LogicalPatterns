//4. Write a Java program to convert minutes into a number of years and days.
package Lab;

import java.util.Scanner;

public class ConvertMinuteIntoYearAndDays 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter minutes: ");
		long minutes = console.nextInt();
		
		long hours = minutes/60;
		long days = hours/24;
		long years = days / 365;
		long remainingDays = days % 365;
		
		System.out.println(minutes + " in " + " years and " + remainingDays + " days");
		console.close();
		 
	}
}
