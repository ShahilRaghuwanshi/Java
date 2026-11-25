package Methods.Type3;

public class SearchApp {

	public static void main(String[] args) {
		
		LinearSearch3 ls = new LinearSearch3();
		
		int res = ls.linearSearch();
		
		if(res >= 0) {
			System.out.println("Key Found at Index: " + res);
		}
		else {
			System.out.println("Key Not Found");
		}
		
	}
}
