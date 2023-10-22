package com.miitSessions;

import java.util.Scanner;

public class AssignmentCalculator {

	public static void main(String[] args) {
//		System.out.println("Hello, we will use a calculator using operations: " + "+ , - , * or / \nEnter first value");
//		Scanner sc = new Scanner(System.in);
//		float first = sc.nextFloat();
//		System.out.println("Enter second value");
//		Scanner sc1 = new Scanner(System.in);
//		Float sec = sc1.nextFloat();
//		System.out.println("Enter operation");
//		Scanner sc2 = new Scanner(System.in);
//		String op = sc2.next();
//		switch (op) {
//		case "+":
//			System.out.println(first + sec);
//			break;
//		case "-":
//			System.out.println(first - sec);
//			break;
//		case "*":
//			System.out.println(first * sec);
//			break;
//		case "/":
//			System.out.println(first / sec);
//			break;
//		default:
//			System.out.println("error");
//		}
//
//		// To find if number is odd or even
//		System.out.println("Great! \nNow, lets enter a number to find out if it is " + "odd or even");
//		Scanner numb = new Scanner(System.in);
//		int a = numb.nextInt();
//		if (a % 2 == 0) {
//			System.out.println("The number is even.");
//		} else {
//			System.out.println("The number is odd.");
//		}

		// To print 1 to 100 using a loop
		System.out.println(
				"Would you like to run a loop 100 times?" + " If yes, please enter the letter 'y'.");
		Scanner ans = new Scanner(System.in);
		String input=ans.next();
		// Intended to make if-else work but its not working
		if (input != "y") {
			int i = 1;
			do {
				System.out.print(i + "  ");
				i = i + 1;
			} while (i <= 100);
		} else {
			System.out.println("Invalid entry!");
		}

	}

}