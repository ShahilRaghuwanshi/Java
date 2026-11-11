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
		System.out.println("==================================");

		

		
		
	}
}
