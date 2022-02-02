package SwitchStatmentProject;

import java.util.Scanner;

public class IceCream 
{
	double chocolatePrice = 4.99;
	double vanillaPrice = 5.99;
	double strawberryPrice = 3.50;
	static double totalPrice = 0;
	static Scanner console = new Scanner(System.in);
	public void IceCreamMenu()
	{
		while(true)
		{
			
		System.out.println("-------Ice Cream Flavors------");
		System.out.println("      1.Chocolate             ");
		System.out.println("      2.Vanilla               ");
		System.out.println("      3.Strawberry            ");
		System.out.println("      4.Back                  ");
		System.out.println("------------------------------");
		
		
		System.out.println("please select your choice: ");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1: 
			chocCalc();
			IceCreamMenu();
			break;
			
		case 2:
			vanCalc();
			IceCreamMenu();
			break;
		
		case 3:
			strCalc();
			IceCreamMenu();
			break;
			
		case 4:
			RestaurantApp.main(null);
			default:
				System.out.println("Please make valid selection..");
		}
		}
	}
	public void chocCalc()
	{
		System.out.println("How many icecream do you want: ");
		int numOfChoc = console.nextInt();
		totalPrice = totalPrice + (numOfChoc * chocolatePrice);
		System.out.println("Your total cost is: " + totalPrice);
		System.out.println();
	}
	public void vanCalc()
	{
		System.out.println("How many icecream do you want: ");
		int numOfVan = console.nextInt();
		totalPrice = totalPrice + (numOfVan * vanillaPrice);
		System.out.println("Your total cost is: " + totalPrice);
		System.out.println();
	}
	public void strCalc()
	{
		System.out.println("How many icecream do you want: ");
		int numOfstr = console.nextInt();
		totalPrice = totalPrice + (numOfstr * strawberryPrice);
		System.out.println("Your total cost is: " + totalPrice);
		System.out.println();
	}

	
}
