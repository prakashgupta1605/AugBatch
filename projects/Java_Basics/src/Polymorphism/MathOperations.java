package Polymorphism;

public class MathOperations {
	
	public int sum(int a, int b) {
		return a+b;
	}
	
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	public String sum(String a, String b) {
		return a+b;
	}
	
	public static void main(String...strings) {
		MathOperations math1 = new MathOperations();
		System.out.println(math1.sum(5, 10));
		System.out.println(math1.sum(5, 10, 15));
		System.out.println(math1.sum("abc", "xyz"));
	}

}
