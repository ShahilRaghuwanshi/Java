/*
 * Reverse: - 
 * copy the contents of one array to another array in reverse direction 
*/
package Strings.Strings_MutableString;

public class Eg7 {

	public static void main(String[] args) {
		
		char[] arr1 = {'a', 'b', 'c', 'd', 'e', 'f'};
		char[] arr2 = new char[arr1.length];
		
		int j = arr2.length - 1;
		for(int i = 0; i < arr1.length; i++) {
			arr2[j] = arr1[i];
			j--;
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
