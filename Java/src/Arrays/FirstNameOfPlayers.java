/*Enter the First Name of the players
 * scenario:
 * players   FirstName 
 * 0
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 */
package Arrays;
import java.util.*;
public class FirstNameOfPlayers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many players you want : ");
		int n = sc.nextInt();
		
		String[] arr = new String[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Player " + i + " Enter Name :");
			arr[i] = sc.next();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("Player " + i + " First Name :" + arr[i]);
		}
	}
}
