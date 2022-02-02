/*
 * WAP to  take 5 subjects marks from user input. and print total mark and percentage.
 */
package Lab;

import java.util.Scanner;

public class Question13 
{
public static void main(String[] args)
{
	Scanner console = new Scanner(System.in);
	int marks = 0;
	int sum = 0;
	double percentage = 1;
	for(int i = 1; i <= 5; ++i)
	{
		System.out.println("Please enter marks "  + i + ":" );
		marks = console.nextInt();
		sum = sum + marks;
	}
	
	System.out.println("Total mark is: " + sum);
	percentage = (sum/500)*100;
	System.out.println("Your percentage is: " + percentage);
	
}
}
