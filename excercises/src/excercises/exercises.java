package excercises;

import java.util.Iterator;
import java.util.Scanner;

public class exercises {

	public static void main(String[] args) {

//		System.out.println("The amount of Whitespace Identificatified is about: " + excerciseWhitespaceIdentification());
		
		excerciseCaseSensitivityCheck();

	}
	
		/*
		 * Write a Java program that takes a string as input and counts the number of
		 * whitespace characters (spaces) in the given string.
		 */
	private static int excerciseWhitespaceIdentification() {

		System.out.println("Write some text: ");
		String text = new Scanner(System.in).nextLine();

		int whiteSpaces = 0;

		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isWhitespace(c)) {
				whiteSpaces++;
			}
		}
		return whiteSpaces;
	}

	/*
	 * Case-Sensitivity Check:
Create a Java method that compares two strings and determines if they are equal, considering case sensitivity.
	 */
	private static boolean excerciseCaseSensitivityCheck() {

		System.out.println("Write the text1: ");
		String text1 = new Scanner(System.in).nextLine();
		System.out.println("Write the text2: ");
		String text2 = new Scanner(System.in).nextLine();

		if (text1.equals(text2)) {
			System.out.println(text1 + " is equals comparing with the " + text2);
			return true;
		} else {
			System.out.println(text1 + " is NOT equals comparing with the " + text2);
			return false;
		}
	}

}
