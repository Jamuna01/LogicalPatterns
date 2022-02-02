//6. write a java program to compute body mass index(BMI).
package Lab;

import java.util.Scanner;

public class ComputeBodyMassIndex
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		System.out.println("Enter weight in lb: ");
		double weight = console.nextDouble();
		
		System.out.println("Enter height in inches: ");
		double height = console.nextDouble();
		double calculateBMI = (weight/(height*height) * 703);
		
		System.out.println(calculateBMI);
	}
}
