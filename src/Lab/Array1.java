//1. How to search an element inside it?
package Lab;

import java.util.Scanner;

public class Array1
{
	static Scanner console = new Scanner(System.in);
	public static void main(String[] args)
	{
		int ar[] = {100, 200, 650, 99, 50};
		
		
		System.out.println("Enter num you want to search: ");
		int num = console.nextInt();
		
		boolean found = false;
		for(int i = 0; i < ar.length; ++i)
		{
			if(num == ar[i])
			{
				found= true;
			}
		}
		if(found == true)
		{
			System.out.println("Number found..");
		}
		else
		{
			System.out.println("Number not found..");
		}
		console.close();
	}
	
}



//8. Write a java program to sum values of an array.