package pac1;

import java.util.Scanner;

public class Lab19 {
	
	public static String strOperation(String str, int option) {
		
		String result = "";
		
		switch (option) {
		
		case 1:
			return str+str;
			
		case 2:
			for (int i = 0; i < str.length(); i++) {
				result += i % 2 == 0 ? str.charAt(i) : '#';
			}
			return result;
			
		case 3:
			for (int i = 0; i < str.length(); i++) {
				
				if ( str.indexOf( str.charAt(i) ) == i )
					result += str.charAt(i);
				
			}
			return result;
			
		case 4:
			for (int i = 0; i < str.length(); i++) {
				result += i % 2 == 0 ? str.charAt(i) : Character.toUpperCase( str.charAt(i) );
			}
			return result;
			
		default:
			return result;
		
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int input; String inString;
		
		System.out.print("Input a string: ");
		inString = scan.nextLine();
		
		do {
			
			System.out.print("0-4: ");
			input = scan.nextInt();
			
			System.out.println(strOperation(inString, input));;
			
		} while (input != 0);
		
		scan.close();

	}

}
