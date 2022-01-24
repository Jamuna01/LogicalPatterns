//6. Armstrong Number
package Assignment3B;

import java.util.Scanner;

public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = console.nextInt();
		
		int value, remainder, sum=0;
		
		value = number;
		
		while(value != 0)
		{
			remainder = value%10; //getting remainder
			sum = (int) (sum + Math.pow(remainder, 3)); // sum of it's cube
			value = value/10; // divisible value
		}
		if(sum == number)
		{
			System.out.println("Given " + number + " is an armstrong number.");
		}
		else
		{
			System.out.println("Given " + number + " is not an armstrong number.");
		}
       
    }
}
