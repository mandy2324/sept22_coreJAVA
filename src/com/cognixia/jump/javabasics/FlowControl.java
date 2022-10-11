package com.cognixia.jump.javabasics;

import java.util.Scanner;

// This class will demonstrate Flow Control using:
// Conditionals - if and Switch
// Loops - for, while, doWhile
public class FlowControl {

	public static void main(String[] args) {
		// Set up some user input, for variable evaluation:
		Scanner input = new Scanner(System.in);

		// prompt user
		System.out.println("Please enter an integer:");

		// collect input
		int readInt = input.nextInt();

		// Conditionals:
		// If
		// check even numbers
		// % = Modulus, which gets the remainder from division of the 2 numbers
		if (readInt % 2 == 0) {
			System.out.println("Your input of: " + readInt + " was an even number.");
			if (readInt > 0) {
				System.out.println("And it's positive");
			} else
				System.out.println("And it's negative.");
		} else if (readInt == 5) {
			System.out.println("You chose my favorite number!");
		} else {
			System.out.println("Your input of: " + readInt + " was an odd number.");
			if (readInt > 0) {
				System.out.println("And it's positive");
			} else
				System.out.println("And it's negative.");
		}

		// Switch Case - works for checking if the integer in this case, is equal to the
		// below
		// options
		switch (readInt) {
		case 1:
			System.out.println("You are withdrawing money.");
			break;
		case 2:
			System.out.println("You are deposting money.");
			break;
		case 3:
			System.out.println("Your balance is: " + 1_000_000);
		}
		
		// The same above logic, but with if statments
		if(readInt == 1) {
			System.out.println("You are withdrawing money.");
		}
		else if(readInt == 2) {
			System.out.println("You are deposting money.");
		}
		else {
			System.out.println("Your balance is: " + 1_000_000);
		}
		
		// Example utility of cascading in Switch (no breaks);
		char in = 'b';
		switch(in) {
		case 'b':
		case 'B':
			System.out.println("You chose letter B.");
		break;
		}

	}

}