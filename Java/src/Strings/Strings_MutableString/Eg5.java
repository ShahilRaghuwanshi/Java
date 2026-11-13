/*
 * toCharArray(): - 
*/

package Strings.Strings_MutableString;

public class Eg5 {
	
	public static void main(String[] args) {
		
		String str = "Kodnest Technologies Pvt Ltd";
		
		char[] ch = str.toCharArray();
		
		for(char ch1 : ch) {
			System.out.print(ch1 + " ");
		}
	}
}
