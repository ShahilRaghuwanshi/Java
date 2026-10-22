/*
 * 2D - String Array 
 * Store the names of the customers present in those banks
 * 
 * Scenario :-
 * Banks 	Customers
 * 0		0 1 2 3 4 
 * 1		0 1 2 3 4 
 * 2		0 1 2 3 4 
 * 3 		0 1 2 3 4 
 * 4		0 1 2 3 4 
 * 5		0 1 2 3 4 
 * 6		0 1 2 3 4 
 */

package Arrays2D;
import java.util.*;
public class Array2D_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][] names = new String[7][5];
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names[i].length; j++) {
				System.out.println("Enter the name of Bank " + i + " Customer " + j);
				names[i][j] = sc.next();
			}
		}
		
		for(int i = 0; i < names.length; i++) {
			for(int j = 0; j < names[i].length; j++) {
				System.out.println(names[i][j]);
			}
			System.out.println();
		}
	}
}
