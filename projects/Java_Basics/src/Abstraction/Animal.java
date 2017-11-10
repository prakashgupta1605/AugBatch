package Abstraction;

public abstract class Animal {	
	abstract void speaks();
	void m1() {};
	public static void main(String...strings) {
		Animal dog1 = new Dog();
		Animal lion1 = new Lion();
		dog1.speaks();
		lion1.speaks();
	}
}

class Dog extends Animal{
	@Override
	void speaks() {
		System.out.println("Dog barks");		
	}	
}

class Lion extends Animal{
	@Override
	void speaks() {
		System.out.println("Lion roars");		
	}	
}
