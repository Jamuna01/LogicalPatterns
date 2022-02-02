//1. Write a java program to convert temperature from Fahrenheit to Celsius degree.
package Lab;

import java.util.Scanner;

public class ConvertTemperature 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter temperature in fahrenheit: ");
		double fahr = console.nextDouble();
		
		double celsius = ((fahr - 32) * 5 )/9;
		System.out.println(fahr + " degree fahrenheit is  " + celsius + " degree celsius.");
		
		
	}
}
