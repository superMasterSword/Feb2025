package pac1;

import java.util.Scanner;

public class Lab1_10 {

	public static boolean isStringPositive(String input) {
		
		input = input.toUpperCase();
		
		for (int i = 0; i < input.length()-1; i++) {
			
			if ( Character.isLetter( input.charAt(i) ) &&
					Character.isLetter( input.charAt(i+1) ) &&
					input.charAt(i) > input.charAt(i+1) ) {
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String line = scan.nextLine();
		
		if (isStringPositive(line)) {
			System.out.println("The string is positive.");
		} else {
			System.out.println("The string is not positive and is possibly negative.");
		}
		
		scan.close();

	}

}
