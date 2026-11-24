package Methods;

public class Calculator {

	//Type 1 
	void add(){
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println(c);
	}
	
	//Type 2
	void sub(int x, int y) {
		int z = x - y;
		System.out.println(z);
	}
	
	//Type 3
	int mul() {
		int m = 10;
		int n = 20;
		int z = m * n;
		return z;
	}
	
	//Type 4
	int div(int x, int y) {
		int z = x / y;
		return z;
	}
}
