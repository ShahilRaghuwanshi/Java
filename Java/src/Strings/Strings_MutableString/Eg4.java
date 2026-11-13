/*
 * split(): - 
 * and for each loop: -
*/

package Strings.Strings_MutableString;

public class Eg4 {

	public static void main(String[] args) {
		
		String str = "Kodnest Techonogies Pvt Ltd";
		
		String[] arr = str.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]	);
		}
		
		//foreach loop
		for(String s : arr) {
			System.out.println(s);
		}
	}
}
