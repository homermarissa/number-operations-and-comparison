// Author: Marissa Homer
// Project: Program #2
//Description: Asking the user for three numbers, creating a menu, asking the user for a choice off the menu, performing the action based off their menu, and using an if/else statement to compare their new number to the third number they gave

import java.util.Scanner;

public class HomerMProject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Initializing the scanner to allow for user input
		Scanner keyboard = new Scanner(System.in);
		
		//Asking the user for three numbers
		//Storing the numbers in variables
		System.out.println("Please enter a number!");
		int numberChoice1 = keyboard.nextInt();
		
		System.out.println("Please enter a second number!");
		int numberChoice2 = keyboard.nextInt();
		
		System.out.println("Please enter a third number!");
		int numberChoice3 = keyboard.nextInt();
		
		//Creating newNumber variable to use later on - this will store the user's new number based on which menu choice they choose
		int newNumber = 0;
		
		//Creating menu
		System.out.println("=====MENU=====");
		System.out.println("1) Add your first two numbers!");
		System.out.println("2) Subtract your first two numbers!");
		System.out.println("3) Multiply your first two numbers!");
		
		//Asking the user for a choice from the menu
		System.out.println("Please choose a number option from the menu!");
		int menuChoice = keyboard.nextInt();
		
		//Using a switch statement to perform the action based off of their choice
		switch (menuChoice) {
			case 1:
				newNumber = (numberChoice1 + numberChoice2);
				System.out.println("Your first two numbers added together is: " + newNumber);
				break;
			case 2:
				newNumber = (numberChoice1 - numberChoice2);
				System.out.println("Your first two numbers subtracted is: " + newNumber);
				break;
			case 3:
				newNumber = (numberChoice1 * numberChoice3);
				System.out.println("Your first two number multiplied is: " + newNumber);
				break;
			default:
				System.out.println("ERROR. INVALID CHOICE. PLEASE PICK A DIFFERENT NUMBER.");
				break;
		}
		
		//Using an if/else statement to determine if their new number is greater or not greater than the third number they entered
		if (newNumber > numberChoice3) {
			System.out.println(newNumber + " is greater than " + numberChoice3 + "! Which is your third number.");
		}
		else {
			System.out.println(newNumber + " is not greater than " + numberChoice3 + "! Which is your third number.");
		}
	}
}
