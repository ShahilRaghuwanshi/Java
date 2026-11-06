/*
 * Create a one dimension array and store 10, 20, 30, 40, 50
 */
package Arrays.questions;

public class Question02 {
	
	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		
		//Even index element
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		//Odd index element
		for(int i = 0; i < arr.length; i++) {
			if(i % 2 != 0) {
				System.out.println(arr[i]);
			}
		}
	}

}
