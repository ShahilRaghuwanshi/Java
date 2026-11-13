/*
 * equalsIgnoreCase(): 
 * this method is used to compare to string by ignoring the cases.
 * 
 * for java it's different small 'n' and capital 'N' because of ASCII value.
*/
package Strings.Strings_ImmutableStrings;

public class Eg9 {

	public static void main(String[] args) {
		
		String s1 = "naveen";
		String s2 = "Naveen";
		
		if(s1 == s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are unequal");
		}
		
		if(s1.equals(s2)) {
			System.out.println("Strings are equal");
		}
		else {
			System.out.println("Strings are unequal");
		}
		
		System.out.println("+++++++++++++++++++++++++++++++++++");
		
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("Strings are equal if cases are ignored");
		}
		else {
			System.out.println("Strings are unequal if cases are ignored");
		}
	}
}
