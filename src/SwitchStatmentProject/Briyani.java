package SwitchStatmentProject;

import java.util.Scanner;

public class Briyani 
{
	double vegBriyaniPrice = 120.0;
	double chiBriyaniPrice = 150.0;
	double mutBriyaniPrice = 200.0;
	static double totalPrice = 0;
	static Scanner console = new Scanner(System.in);
	public void briyaniMenu()
	{
		while(true)
		{
			
		System.out.println("-------Types of Briyani------");
		System.out.println("      1.Veg Briyani          ");
		System.out.println("      2.Chicken Briyani      ");
		System.out.println("      3.Mutton Briyani       ");
		System.out.println("      4.Back                 ");
		System.out.println("-----------------------------");
		
		
		System.out.println("please select your choice: ");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1: 
			vegBriyani();
			briyaniMenu();
			break;
		case 2:
			chiBriyani();
			briyaniMenu();
			break;
		
		case 3: 
			mutBriyani();
			briyaniMenu();
			break;
			
		case 4:
			RestaurantApp.main(null);
			default:
				System.out.println("Please make valid selection..");
		}
		}
	}
	public void vegBriyani()
	{
		System.out.println("How many plates of veg briyani do you want:");
		int plates = console.nextInt();
		totalPrice = totalPrice + (plates * vegBriyaniPrice);
		System.out.println("Your total cost is: " + totalPrice);
		System.out.println();
	}
	public void chiBriyani()
	{
		System.out.println("How many plates of chicken briyani do you want:");
		int plates = console.nextInt();
		totalPrice = totalPrice + (plates * chiBriyaniPrice);
		System.out.println("Your total cost is: " + totalPrice);
		System.out.println();
	}
	public void mutBriyani()
	{
		System.out.println("How many plates of mutton briyani do you want:");
		int plates = console.nextInt();
		totalPrice = totalPrice + (plates * mutBriyaniPrice);
		System.out.println("Your total cost is: " + totalPrice);
		System.out.println();
	}

	
}
