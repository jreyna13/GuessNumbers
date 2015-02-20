//Javier Reyna 02/19/2015

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
	
	public static void main(String[] args) {
	
		int number = (int)(Math.random() * 101);
		int userInput = -1;
		
		//create scanner object for keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		while (userInput != number){
		
		//print
		System.out.println("Enter a number between 1 and 100");
		
		//get the user input
		userInput = keyboard.nextInt();
		
		
		if (userInput == number)
	
	
		System.out.println("you have guessed right");
	
		

		else if (userInput > number)
		
		
			
		System.out.println("Guess Lower");
		
		
		else
		
		
		System.out.println("Guess Higher");
		}
		}
		
		
}

