package SwitchStatmentProject;

import java.util.Scanner;

public class HotDrinks
{
	static Scanner console = new Scanner(System.in);
	double coffeePrice = 4.75;
	double teaPrice = 3.50;
	static double totalPrice = 0;
	
	public void hotDrinksMenu()
	{
		while(true)
		{
			
		System.out.println("---------Hot Drinks----------");
		System.out.println("         1.Coffee            ");
		System.out.println("         2.Tea               ");
		System.out.println("         3.Back              ");
		System.out.println("-----------------------------");
		
		
		System.out.println("please select your choice: ");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1: 
			coffeeCal();
			break;
		case 2:
			teaCal();
			break;
		
		case 3: 
			RestaurantApp.main(null);
			default:
				System.out.println("Please make valid selection..");
		}
		}

	}
	public void coffeeCal()
	{
		System.out.println("How many coffee do you want: ");
		int numOfCoffee = console.nextInt();
		totalPrice = totalPrice + (numOfCoffee * coffeePrice);
		System.out.println("Your total price is: $" + totalPrice);
		System.out.println();
	}
	public void teaCal()
	{
		System.out.println("How many tea do you want: ");
		int numOfTea = console.nextInt();
		totalPrice = totalPrice + (numOfTea * teaPrice);
		System.out.println("Your total price is: $" + totalPrice);
		System.out.println();
	}
}


