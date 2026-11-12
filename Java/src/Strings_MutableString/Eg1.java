/*
 * Mutable Strings: - 
 * 
 * "Mutable Strings are such string which can be altered once created."
 * To create mutable string we have to make use of inbuilt StringBuffer or StringBuilder class.
 * Initial capacity of StringBUffer and StringBuilder is 16.
 * If the capacity is filled to it's full then new capacity would be generated 
 * which is equal to = ( Old Capacity x 2 ) + 2.
 * 		# 	Old capacity * 2 + 2	#	
*/

package Strings_MutableString;
import java.util.*;

public class Eg1 {

	public static void main(String[] args) {
		
		//Immutable String creation
		String s1 = new String("Raja Ram");
		System.out.println(s1);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Mutable String Creation Using StringBuilder
		StringBuilder sb = new StringBuilder("Raja Ram");
		System.out.println(sb);
		sb.append("Mohna Roy");
		System.out.println(sb);
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		//Mutable String Creation Using StringBuffer
		StringBuffer sb1 = new StringBuffer("Raja Ram");
		System.out.println(sb1);
		sb1.append("Mohan Roy");
		System.out.println(sb1);
		System.out.println("+++++++++++++++++++++++++++++++++++++");

	}
}
