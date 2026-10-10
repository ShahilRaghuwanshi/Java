package TakingInputFromKeyboard;

import java.util.Scanner;

public class TakingInputFromKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. Integer
		System.out.println("Enter an Integer number:");
		int a = sc.nextInt();
		System.out.println("Value: " + a);
		System.out.println("=============================================");
		
		// 2. Byte 
		System.out.println("Enter a Byte number (-128 to 127):");
		byte b = sc.nextByte();
		System.out.println("Value: " + b);
		System.out.println("=============================================");
		
		// 3. Short 
		System.out.println("Enter a Short number:");
		short c = sc.nextShort();
		System.out.println("Value: " + c);
		System.out.println("=============================================");
		
		// 4. Long
		System.out.println("Enter a Long number:");
		long d = sc.nextLong();
		System.out.println("Value: " + d);
		System.out.println("=============================================");
		
		// 5. Float
		System.out.println("Enter a Float number:");
		float f = sc.nextFloat();
		System.out.println("Value: " + f);
		System.out.println("=============================================");
		
		// 6. Double
		System.out.println("Enter a Double number:");
		double g = sc.nextDouble();
		System.out.println("Value: " + g);
		System.out.println("=============================================");
		
		// 7. Boolean
		System.out.println("Enter a Boolean value (true/false):");
		boolean h = sc.nextBoolean();
		System.out.println("Value: " + h);
		System.out.println("=============================================");
		
		// 8. Char
		System.out.println("Enter a Character:");
		char i = sc.next().charAt(0);
		System.out.println("Value: " + i);
		System.out.println("=============================================");
		
		// 9. String (Single Word - next)
		System.out.println("Enter a Word (String):");
		String s = sc.next();
		System.out.println("Value: " + s);
		System.out.println("=============================================");
		
		// Clearing buffer before nextLine()
		sc.nextLine(); 
		
		// 10. String (Full Line - nextLine)
		System.out.println("Enter a Full Line (Sentence):");
		String s1 = sc.nextLine();
		System.out.println("Value: " + s1);
		System.out.println("=============================================");
		
		sc.close();
	}
}