/*
 * The ensureCapacity(): - 
 * ensureCapacity() is used to ensure the minimum capacity specified by the user.
 */
package Strings_MutableString;

public class Eg3 {

	public static void main(String[] args) {
		
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.ensureCapacity(70);
		System.out.println(sb.capacity());
		System.out.println("=====================================");
		
		//StringBuffer
		StringBuffer sbu = new StringBuffer(70);
		System.out.println(sbu.capacity());
		System.out.println("=====================================");

	}
}
