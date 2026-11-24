package Methods;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("Enter two numbers: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Calculator cal = new Calculator();
		cal.add();
		
		cal.sub(x, y);
		
		int res1 = cal.mul();
		System.out.println("Multiplication result is: " + res1);

		int res2 = cal.div(x, y);
		System.out.println("Division result is: " + res2);
		
	}
}
