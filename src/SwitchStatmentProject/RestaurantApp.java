package SwitchStatmentProject;

import java.util.Scanner;

public class RestaurantApp 
{
	public static void main(String[] args)
	{
		System.out.println("********Restaurant App******");
		System.out.println("*       1) Briyani         *");
		System.out.println("*       2) Drinks          *");
		System.out.println("*       3) Ice Cream       *");
		System.out.println("*       4) Exit            *");
		System.out.println("****************************");
		
		Scanner console = new Scanner (System.in);
		
		System.out.println("please make a selection: ");
		int selection = console.nextInt();
		
		switch(selection)
		{
		case 1:
			Briyani bri = new Briyani();
			bri.briyaniMenu();
			break;
		case 2:
			Drinks dri = new Drinks();
			dri.drinkMenu();
			break;
		case 3:
			IceCream ice = new IceCream();
			ice.IceCreamMenu();
			break;
		case 4:
			System.out.println("Thank you for using Restaurant App!");
			System.exit(0);
			break;
		default:
				System.out.println("Try again later..");
		}
		
	}
}
