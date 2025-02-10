package pac1;

import java.util.Scanner;

public class Lab15 {

	public static void main(String[] args) {

		System.out.print("\nInput a number: ");
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		if (number < 0) {
			System.out.println("The number is negative.");
		} else {
			System.out.println("The number is positive");
		}
		
		scan.close();
		
	}
}
