//2. Write a java program that reads a number in inches, converts it to meters.
package Lab;

import java.util.Scanner;

public class ConvertInchesToMeters
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		double inches;
		double meter = 0.0254;
		double result ;
		
		System.out.println("Enter a number in inches:  ");
		inches = console.nextDouble();
		result = inches * meter;
		
		System.out.println(inches + " inches is " + result + " meter");
		
	}
}
