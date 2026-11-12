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
		
		//compareToIgnoreCase(): - 
		String s7 = "Mohan";
		String s8 = "mohan";
		
		if(s7.compareToIgnoreCase(s8) > 0) {
			System.out.println("Strings s7 is greeater");
		}else if(s7.compareToIgnoreCase(s8) < 0){
			System.out.println("Strings s8 is greater");
		}else {
			System.out.println("Both are equal");
		}
		System.out.println("==================================");
		
		//endsWith(): -
		System.out.println(s7.endsWith("n"));
		System.out.println("==================================");
		
		//lastIndexOf(): - 
		System.out.println(s7.lastIndexOf('n'));
		System.out.println("==================================");

		//length(): - 
		System.out.println(s8.length());
		System.out.println("==================================");

		//replace(): - 
		s8 = "divya";
		s7 = s7.replace('n', 'm');
		System.out.println(s7);
		System.out.println("==================================");

		//replaceAll(): - 
		s7 = s7.replaceAll(s7, s8);
		System.out.println(s7);
		System.out.println("==================================");

		//replaceFirst(): -
		s7 = s7.replaceFirst(s7, s8);
		System.out.println(s7);
		System.out.println("==================================");

		//split(): - 
		s7 = "kodnest technologies";
		String[] s = s7.split("d");
		for(int i =0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("==================================");
		
		//startsWith(): - 
		System.out.println(s7.startsWith(s8));
		System.out.println("==================================");

	}
}
