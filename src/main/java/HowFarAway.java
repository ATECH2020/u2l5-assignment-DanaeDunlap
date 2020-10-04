import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
			//Intializes the variables 
			double startLat, startLong, finishLat, finishLong; 

			//Asks the user for the value
			Scanner in = new Scanner(System.in);

			System.out.print("Enter the latitude of the starting location: ");
			startLat = in.nextDouble(); 

			System.out.print("Enter the longitude of the starting location: "); 
			startLong = in.nextDouble(); 

			System.out.print("Enter the latitude of the ending location: ");
			finishLat = in.nextDouble(); 

			System.out.print("Enter the longitude of the ending location: "); 
			finishLong = in.nextDouble();


			//Creates the startLocation and finishLocation object
      GeoLocation startLocation = new GeoLocation(startLat, startLong); 
			GeoLocation finishLocation = new GeoLocation(finishLat, finishLong); 

			//Calculates and prints the distance
			System.out.print("The distance is " + startLocation.distanceFrom(finishLocation) + " miles");
    }
}