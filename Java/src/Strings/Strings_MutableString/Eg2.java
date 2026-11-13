/*
 * Capacity: -
 * initial capacity is 16 if it will full then next capacity will  be
 * old capacity * 2 + 2
 * 16 * 2 + 2 = 34 
*/

package Strings.Strings_MutableString;

public class Eg2 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Prahllad is a BatsMan");
		System.out.println(sb.capacity());
		sb.append("He lives in chennai");
		System.out.println(sb.capacity());
		System.out.println("=========================================");
		
		StringBuilder sbu = new StringBuilder();
		System.out.println(sbu.capacity());
		sbu.append("Prahllad is a BatsMan");
		System.out.println(sbu.capacity());
		sbu.append("He lives in Chennai");
		System.out.println(sbu.capacity());
		System.out.println("=========================================");

	}
}
