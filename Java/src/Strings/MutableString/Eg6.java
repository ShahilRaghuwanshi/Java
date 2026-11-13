/*
 * Copy the contents from one array to another.
 * How to copy contents of char array into another char
*/

package Strings.MutableString;

public class Eg6 {

	public static void main(String[] args) {
		
		char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] arr2 = new char[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		System.out.println("Array1 contents are...> ");
		for(char ch : arr1) {
			System.out.print(ch + " ");
		}
		System.out.println();
		System.out.println("Array2 contents are...> ");
		for(char ch : arr2) {
			System.out.print(ch + " ");
		}
	}
}
