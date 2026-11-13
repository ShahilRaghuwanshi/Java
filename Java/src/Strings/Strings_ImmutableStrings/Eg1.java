/*
 * equals to operator ( == )        
 * Comparing references : - 
*/
package Strings.Strings_ImmutableStrings;

public class Eg1 {

	public static void main(String[] args) {
		
		//Creating immutable string without using new character 
		String s1 = "Omkar";
		String s2 = "Omkar";
		
		if(s1 == s2) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("References are unequal");
		}
	}
}
