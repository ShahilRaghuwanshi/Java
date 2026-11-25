package Methods.Type4;

public class LinearSearch4 {

	int linearSearch(int[] arr, int key) {
		
		//linearSearch logic 
		for(int i =0; i < arr.length; i++) {
			if(key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
