package AccessSpecifiersOutsidePackage;

import AccessSpecifiers.A;

// outside package you can access only public member
public class C {

	public static void main(String[] args) {
		A a = new A();
		a.publicMethod();
		

	}

}
