/*
 * How to convert string to character 
 * String to integer
 * Integer to string 
 * String to real number
 * real number to string 
 * string to boolean 
 * boolean to string 
*/

package Strings.Strings_ImmutableStrings;

public class StringConversions {

	public static void main(String[] args) {
		
		String s1 = "Kodnest technologies";
		
		// 1. String to character
		// 1.1 Print with the help of loop and charAt()
		for(int i = 0; i < s1.length(); i++) {
			System.out.print(s1.charAt(i) + " ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		// 1.2 Using toCharArray()
		char[] ch = s1.toCharArray();
		for(int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
		System.out.println("=====================================");

		// 2. Character array to String
		char[] ch1 = {'a', 'm', 'a', 'n'};
		String str = new String(ch1);
		System.out.println("Character array to String: " + str);
		System.out.println("Length: " + str.length());
		System.out.println("=====================================");
		
		// 3. String to Integer
		// 3.1 Standard way using Integer.parseInt()
		String s2 = "12345";
		int num = Integer.parseInt(s2);
		System.out.println("String to Integer: " + num);

		// 3.2 Manual digit extraction (when string contains digits)
		String s2Digits = "567";
		for(int i = 0; i < s2Digits.length(); i++) {
			int digit = s2Digits.charAt(i) - '0';
			System.out.print(digit + " ");
		}
		System.out.println();
		System.out.println("=====================================");
		
		// 4. Integer to String
		int b = 50;
		String s3 = String.valueOf(b); // or b + ""
		System.out.println("Integer to String: " + s3);
		System.out.println("Length: " + s3.length());
		System.out.println("=====================================");

		// 5. String to Real Number (Float / Double)
		String s4 = "3.14159";
		float fVal = Float.parseFloat(s4);
		double dVal = Double.parseDouble(s4);
		System.out.println("String to Float: " + fVal);
		System.out.println("String to Double: " + dVal);
		System.out.println("=====================================");

		// 6. Real number to String
		float f = 5.555f;
		String s5 = String.valueOf(f);
		System.out.println("Float to String: " + s5);
		System.out.println("Length: " + s5.length());
		System.out.println("=====================================");
		
		// 7. String to Boolean
		String s6 = "true";
		boolean boolVal = Boolean.parseBoolean(s6);
		System.out.println("String to Boolean: " + boolVal);
		
		// Note: Boolean.parseBoolean returns false for anything other than "true" (case-insensitive)
		String s7 = "Om";
		boolean boolVal2 = Boolean.parseBoolean(s7); 
		System.out.println("String 'Om' to Boolean: " + boolVal2); // prints false
	}
}