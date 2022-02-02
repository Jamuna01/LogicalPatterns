/*7. Write a Java program to takes the user for a distance (in meters) and the time
was taken (as three numbers: hours, minutes, seconds), and display the speed, in meters per 
second, kilometers per hour and miles per hour (hint: 1 mine = 1609 meters.)
*/
package Lab;

import java.util.Scanner;

public class DisplayTheSpeed
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.println("Enter distance in meters: ");
		
		double distance = console.nextDouble();
		double distanceInKm = distance/1000.0;
		double distanceInMiles = distance / 1609.0;
		
		System.out.println("Enter hours: ");
		int hours = console.nextInt();
		
		System.out.println("Enter minutes: ");
		int minutes = console.nextInt();
		
		System.out.println("Enter seconds: ");
		int seconds = console.nextInt();
		
		int timeInSecond = (hours * 60 * 60) + (minutes * 60) + seconds;
		
		double totalTimeInHours = timeInSecond / 3600.0;
		
		double speedMeterPerSecond = distance/ timeInSecond ;
		
		System.out.println("Speed meter/ second " + speedMeterPerSecond);
		
		double speedKmPerHour = distanceInKm /  totalTimeInHours;
		System.out.println("Speed KM/Hour " + speedKmPerHour);
		
		double speedMilesPerHour = distanceInMiles / totalTimeInHours;
		System.out.println("Speed Miles/Hour " + speedMilesPerHour);
	}
}
