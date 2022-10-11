package com.cognixia.jump.javabasics;

import java.util.Scanner;

// this demo will use a java standard library data type, scanner, to read user input from the keyboard
//note- scanner is not a primitive data type, but rather a class/ object.
public class ReadFromConsole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//This program takes in user input, and will print it
		
//step 1 - set up, the user input with a scanner
		
		Scanner input = new Scanner(System.in);
//step 2 - prompt user with instructions
		System.out.println("Enter a sentance");
		System.out.println("Enter an integer");

//step 3 - read the user input and store as needed.
//set the data type for the expected input then collect the input with the appropriate scanner type
		
		String readInput = input.nextLine();
		int readInput1 = input.nextInt();

//step 4 - print the input to the console
		System.out.println(readInput);
		System.out.println(readInput1);


	}

}
