/*
 * Other inbuilt method's present in String class
 */
package Strings;

public class InbuiltMehods {

	public static void main(String[] args) {
		
		String s1 = "Raja Ram Mohan Roy";
		System.out.println(s1);
		System.out.println("==================================");
		
		//toUpperCase(): -
		System.out.println(s1.toUpperCase());
		System.out.println("==================================");
		
		//the string will not change the clone is printed above in upper case
		System.out.println(s1);
		System.out.println("==================================");

		//toLowerCase(): - 
		System.out.println(s1.toLowerCase());
		System.out.println("==================================");

		//charAt(): - you know the index and you want the character of the index
		System.out.println(s1.charAt(13));
		System.out.println("==================================");

		//indexOf(): - you have the index and you want the character it will give first occurrence only
		System.out.println(s1.indexOf('n'));
		System.out.println("==================================");

		//contains(): - true / false
		System.out.println(s1.contains("Ram"));
		System.out.println(s1.contains("Kaam"));
		System.out.println("==================================");
		
		//substring(): - A part of a string is called substring
		System.out.println(s1.substring(11));
		//give string until n - 1
		System.out.println(s1.subSequence(1, 11));
		System.out.println("==================================");

		//isEmpty(): - true / false
		System.out.println(s1.isEmpty());
		String s2 = new String();
		System.out.println(s2.isEmpty());
		System.out.println("==================================");
		
		//concat(): - 
		s2 = s2.concat("  RamaSita  ");
		System.out.println(s2);
		System.out.println("==================================");

		//trim(): - to remove leading space and trailing space
		System.out.println(s2.trim());
		System.out.println("==================================");

		//intern(): - you have string in non-constant pool and want to bring it in constant pool
		String s3 = new String("Omkar");		//String in non-constant pool
		String s4 = s3.intern();
		System.out.println(s4);
		System.out.println("==================================");

		String s5 = "Omkar";
		if(s4 == s5) {
			System.out.println("References are equal");
		}
		else {
			System.out.println("References are not equal");
		}
		System.out.println("==================================");
		
	}
}
