package IncrementAndDecrementOperator;

public class Assignment {
	public static void main(String[] args) {
		int a = 100;
		int b;
		b = a++ + ++a + --a + a-- + ++a + a++ + --a + a-- + a++ + ++a + a-- + --a - a--;
		System.out.println(a);
		System.out.println(b);
	}
}
