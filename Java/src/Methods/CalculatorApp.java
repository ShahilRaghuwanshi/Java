package Methods;

public class CalculatorApp {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add();
		cal.sub(20, 10);
		int res1 = cal.mul();
		int res2 = cal.div(10, 20);
		
		System.out.println(res1);
		System.out.println(res2);
		
	}
}
