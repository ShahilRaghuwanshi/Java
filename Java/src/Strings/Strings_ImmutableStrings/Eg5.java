package Strings.Strings_ImmutableStrings;

public class Eg5 {

	public static void main(String[] args) {
		
		//constant pool String will not change 
		String s1 = "Rama";
		System.out.println(s1);
		
		//copy of s1 is concat s1 will remain same it will never change
		String s2 = s1.concat("sita");
		System.out.println(s1);
		System.out.println(s2);
	}
}
