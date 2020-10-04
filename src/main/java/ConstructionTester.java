import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
			
      // intializes the variable 
			double salesTax, total, grandTotal; 
			int numBoards, numWindows; 

			// ask the user for the value
			Scanner in = new Scanner(System.in); 

			System.out.println("Enter the sales tax rate: "); 
			salesTax = in.nextDouble(); 

			System.out.println("How many boards do you need? "); 
			numBoards = in.nextInt(); 

			System.out.println("How many windows do you need? ");
			numWindows = in.nextInt(); 

     // creates the construct object
			Construction construct = new Construction(8.00, 11.00, salesTax); 

			// calculates the grand total
			total = construct.lumberCost(numBoards) + construct.windowCost(numWindows); 

			grandTotal = construct.grandTotal(total);

			System.out.println("Total: " + total);
			System.out.println("Grand Total: " + grandTotal);  

    }
}
