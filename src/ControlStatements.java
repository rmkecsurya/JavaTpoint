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
		 * Simple if else ladder
		 */
		if(a>b)
			System.out.println("Value 1 is greater");
		else
			System.out.println("Value 2 is greater");
		
		/**
		 * if else if statements
		 */
		if(a>b)
			System.out.println("Value 1 is greater");
		else if(a==b)
			System.out.println("Equal Values");
		else if(a<b)
			System.out.println("Value 2 is greater");
		
		if(a>b)
			System.out.println("Value 1 is greater");
		/*else if(a==b)
			System.out.println("Equal Values");*/
		else if(a<b)
			System.out.println("Value 2 is greater");
		else
			System.out.println("Else Statement");
		
		
		
		
		
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
		// For loop
		for(int i=0;i<10;i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		String s="Suryanagarajgeetha";
		// For-Each loop
		for(char i : s.toCharArray()) {
			System.out.print(i+" ");
		}
		System.out.println();
		int i=0;
		//While loop
		while(i<10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		//Do-While loop
		int i1=0;
		do {
			System.out.println(i1+": times");
		}while(i1>1);
		
		//Ternary Operator
		String output = (i%2==0)?"Even":"odd";
		System.out.println(output);
	}

}
