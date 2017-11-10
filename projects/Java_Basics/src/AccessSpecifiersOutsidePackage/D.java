package AccessSpecifiersOutsidePackage;

import AccessSpecifiers.A;

// if u extend a class, you can access protected members
public class D extends A{
	public static void main(String...strings) {
		D d = new D();
		d.publicMethod();
		d.protectedMethod();
		
	}

}
