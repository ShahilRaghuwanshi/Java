package Methods;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Calculator cal = new Calculator();
		cal.add();
		cal.sub(x, y);
		int res1 = cal.mul();
		int res2 = cal.div(x, y);
		
		System.out.println(res1);
		System.out.println(res2);
		
	}
}
