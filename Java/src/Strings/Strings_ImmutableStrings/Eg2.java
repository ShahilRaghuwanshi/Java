/*
 * equals() method : -   
 * Comparing Contents : - 
*/
package Strings.Strings_ImmutableStrings;

public class Eg2 {

	public static void main(String[] args) {
		
		//Creating immutable string without using new character 
		String s1 = "Omkar";
		String s2 = "Omkar";
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}else {
			System.out.println("Strings are unequal");
		}
	}
}
