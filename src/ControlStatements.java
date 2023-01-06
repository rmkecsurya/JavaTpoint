import java.util.Scanner;

public class ControlStatements {

	public static void main(String[] args) {
		// Decision making using if else
		/**
		 * it return either true or false
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value1");
		int a = sc.nextInt();
		System.out.println("Enter a value2");
		int b = sc.nextInt();
		/**
		 * Simple if else lader
		 */
		if(a>b)
			System.out.println("Value 1 is greater");
		else
			System.out.println("Value 2 is greater");
		
		// Decision making statements using Switch
		switch(a) {
		case 1:
			System.out.println("Case1");
			break;
		case 2:
			System.out.println("Case2");
			break;
		case 12:
			System.out.println("Case 12");
			break;
		default:
			System.out.println("default");
		}
		
		//Looping Statements
		/**
		 * 1. Do-While loop
		 * 2. While loop
		 * 3. For loop
		 * 4. For-each loop
		 * 
		 */
		

	}

}
