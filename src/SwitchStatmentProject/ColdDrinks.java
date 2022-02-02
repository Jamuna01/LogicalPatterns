package SwitchStatmentProject;

import java.util.Scanner;

public class ColdDrinks
{
	static Scanner console = new Scanner(System.in);
	double cokePrice = 2.50;
	double spritePrice = 1.99;
	double fantaPrice = 1.50;
	static double totalPrice = 0;
	
	public void coldDrinksMenu()
	{
		while(true)
		{
			
		System.out.println("---------Cold Drinks---------");
		System.out.println("      1.Coke                 ");
		System.out.println("      2.Sprite               ");
		System.out.println("      3.Fanta                ");
		System.out.println("      4.Back                 ");
		System.out.println("-----------------------------");
		
		
		System.out.println("please select your choice: ");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1: 
			cokeCal();
			break;
		case 2:
			spriteCal();
			break;
		
		case 3: 
			fantaCal();
			break;
			
		case 4:
			RestaurantApp.main(null);
			default:
				System.out.println("Please make valid selection..");
		}
		}

	}
	public void cokeCal()
	{
		System.out.println("How many coke do you want: ");
		int numOfCokes = console.nextInt();
		totalPrice = totalPrice + (numOfCokes * cokePrice);
		System.out.println("Your total price is: $" + totalPrice);
		System.out.println();
	}
	public void spriteCal()
	{
		System.out.println("How many sprite do you want: ");
		int numOfSprite = console.nextInt();
		totalPrice = totalPrice + (numOfSprite * spritePrice);
		System.out.println("Your total price is: $" + totalPrice);
		System.out.println();
	}
	public void fantaCal()
	{
		System.out.println("How many fanta do you want: ");
		int numOfFanta = console.nextInt();
		totalPrice = totalPrice + (numOfFanta * fantaPrice);
		System.out.println("Your total price is: $" + totalPrice);
		System.out.println();
	}
}
