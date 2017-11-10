package AccessSpecifiers;

public class B {
	public static void main(String...strings) {
		A a = new A();
		a.publicMethod();
		a.protectedMethod();
		a.defaultMethod();
	}

}
