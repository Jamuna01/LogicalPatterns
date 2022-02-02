package Lab;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String[] args)
	{
	Scanner console = new Scanner(System.in);
	
		System.out.println("Enter a number to get factorial of: " );
		int num = console.nextInt();
		
		int fact = 1;
		for(int i = 1; i <= num; i++)
		{
			fact = i * fact;
		}
		System.out.println("Factorial of " + num + ": " + fact);
}
}
