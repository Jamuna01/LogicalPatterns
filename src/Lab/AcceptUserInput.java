/*
 *8. Write a Java program that read a number and display square, cube, and fourth power;
 * 
 */
package Lab;

import java.util.Scanner;

public class AcceptUserInput
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a integer value: ");
		int x = console.nextInt();
		
		double square = Math.pow(x, 2);
		System.out.println("Square of " + x + " is: "+ square);
		
		double cube = Math.pow(x, 3);
		System.out.println("Cube of " + x + " is: "+ cube);
		
		double fourth = Math.pow(x, 4);
		System.out.println("Fourth of " + x + " is: "+ fourth);
		
	}
}
