
public class StringsConcepts {

	public static void main(String[] args) {
		/**
		 * In java string is an object
		 * String can be created in three 2 ways
		 * 1. Using string literals
		 * 2. By new keyword 
		 */
		
		String s1 = "Java String";
		String s2 = new String("java String");
		System.out.println(s1+"\n"+s2);
		//String Methods
		//charAt returns a char
		char result = s1.charAt(1);
		System.out.println(result);
		
		int strLength = s1.length();
		System.out.println(strLength);
		
		String subString1 = s1.substring(3);
		String subString2 = s1.substring(3,10);
		System.out.println(subString1);
		System.out.println(subString2);
		
		boolean res = s1.contains("Str");
		System.out.println(res);
		
		boolean res1 = s1.equals(s2);
		System.out.println(res1); //false Because it checks the address of the objects
		
		boolean res3 = s1.isEmpty();
		System.out.println(res3);
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		/**
		 * String Comparision if of 3 types
		 *  1. Using equals() method
		 *     a. equals()
		 *     b. equalsIgnoreCase()
		 *  2. using == operator  --> It compared the references not values
		 *  3. using compareTo() method 
		 *       It returns the lexilogical value 
		 *       if s1==s2 0
		 *       if s1>s2 +ve int
		 *       if s1<s2 -ve int
		 *  
		 *  
		 */
		String str1 = "String";
		String str2 = "StrINg";
		String str3 = "NotAString";
		String str4 = "NotaSTRing";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		System.out.println(str3==str4);
		System.out.println(str3.compareTo(str1));
		
		
		/**
		 * String Concatenation
		 * 1. Using + operator
		 * 2. using concat() operator
		 * 
		 */
		
		String str5 = "String";
		String str6 = "Concat";
		System.out.println(str5.concat(str6));
		System.out.println(str5+str6);
		System.out.println(String.format("%s%s",s1,s2));
		
		
		/**
		 * SubString in java
		 *    1. substring(int startIndex, int endIndex) 
		 *    2. substring(int startIndex)
		 */
		
		System.out.println(s1.substring(3));
		System.out.println(s2.substring(1,11));
		
		
		
	}

}
