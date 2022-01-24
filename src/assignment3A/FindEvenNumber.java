
//1. Write a program given number is even number of not?

package assignment3A;
import java.util.Scanner;

public class FindEvenNumber 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = console.nextInt();
		
		if(number%2 == 0)
		{
			System.out.println("Number " + number + " is even.");
		}
		else
		{
			System.out.println("Number "+ number + " is  not 2even.");
		}
	}
}
