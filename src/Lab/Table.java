package Lab;

import java.util.Scanner;

public class Table
{
	public static void main(String[] args)
	{
	Scanner console = new Scanner(System.in);
	
		System.out.println("Please enter a number to print a table" );
		int num = console.nextInt();
		int k = num;
		for(int i = 1; i <= 10; i++)
		{
		System.out.println(k + " * " + i + " = " + (i*num));
	}
		
		
	
	
}
}