import java.util.Scanner;
public class NestedLoopTableApp {	//driver class

	public static void main(String[] args) {
		/*
			TODO: Create a program that prints out lines of numbers in a "pyramid" formation.
			i.e.: 
			1
			1 2
			1 2 3 
			1 2 3 4 
			1 2 3 4 5
			1 2 3 4 5 6
			
			Using a nested loop. Prompt the user for the first and last numbers to print out, 
			and continue the app with a (y/n) input from the user. Run the program at least once.
			Ask for user input through the console, and print the result into the console.
		*/
		NestedLoopTable nlt = new NestedLoopTable();	//create an object of NestedLoopTable
		Scanner input = new Scanner(System.in);
		String choice = "y";
		
		int first,	//declare int for first and last numbers
			last;
		
		while (choice.equalsIgnoreCase("y")) {	//while loop runs program once, then prompts user to continue or quit
			//TODO: Prompt user for first and last numbers
			System.out.print("Enter the first number of the pyramid: ");
			first = input.nextInt();
			System.out.print("Enter the last number of the pyramid: ");
			last = input.nextInt();
			nlt.setNums(first, last);

			//TODO: pyramid is printed using nested loops
			nlt.printPyramid();
			System.out.print("\n Print a new pyramid? (y/n)");
			choice = input.nextLine();
		}	//end while
		
	}	//end main()

}	//end NestedLoopTableApp
