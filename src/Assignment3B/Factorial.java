//5.Factorial
package Assignment3B;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter a number to find the factorial of: ");
		int factorial = console.nextInt();
		int findFactorial = 1;
		
		for(int i = 1; i <= factorial; i++)
		{
			findFactorial = i * findFactorial;
		}
		System.out.print("Factorial of " + factorial + " is: " +findFactorial + " ");
		
		
	}
}
