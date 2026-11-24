package Methods;

import java.util.Scanner;

public class Calculator {

	Scanner sc = new Scanner(System.in);

	//Type 1 
	void add(){
		
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a + b;
		
		System.out.println("Addition result is : " + c);
	}
	
	//Type 2
	void sub(int x, int y) {
		
		int z = x - y;
		
		System.out.println("Subtarction result is: " + z);
	}
	
	//Type 3
	int mul() {
		
		System.out.println("Enter two numbers: ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int z = m * n;
		
		return z;
	}
	
	//Type 4
	int div(int x, int y) {
		
		int z = x / y;
		
		return z;
	}
}
