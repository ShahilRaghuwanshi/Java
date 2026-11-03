/*
 * Write a java program to swapping to number
*/

package Arrays.questions;

import java.util.*;

public class Question02 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swapping : ");
		System.out.println("Value of a and b are a = " + a + " b = " + b);
		
//		int help;
//		help = a;
//		a = b;
//		b = help;
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After Swapping : ");
		System.out.println("Value of a and b are a = " + a + " b = " + b);

	}
}
