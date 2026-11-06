/*
 * Create a one dimension array and store 10, 20, 30, 40, 50
 */
package Arrays.questions;

public class Question02 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		for(int i = 1; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
