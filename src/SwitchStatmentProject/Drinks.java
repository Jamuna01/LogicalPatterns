package SwitchStatmentProject;

import java.util.Scanner;

public class Drinks
{
	static Scanner console = new Scanner(System.in);
	public void drinkMenu()
	{
		while(true)
		{
			
		System.out.println("-------Types of drinks------");
		System.out.println("      1.Cold drinks         ");
		System.out.println("      2.Hot drinks          ");
		System.out.println("      3.Back                ");
		System.out.println("----------------------------");
		
		
		System.out.println("please select your choice: ");
		int choice = console.nextInt();
		
		switch(choice)
		{
		case 1: 
			ColdDrinks cd = new ColdDrinks();
			cd.coldDrinksMenu();
			break;
		case 2:
			HotDrinks hd = new HotDrinks();
			hd.hotDrinksMenu();
			break;
			
		case 3:
			RestaurantApp.main(null);
			default:
				System.out.println("Please make valid selection..");
		}
		}
	
	}
}
