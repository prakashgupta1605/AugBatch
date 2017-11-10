package Polymorphism;

public class Animal {
	
	public void speaks() {
		System.out.println("Animal speaks");
	}
	
	public static void main(String...strings) {
		Lion lion1 = new Lion();
		lion1.speaks();
		Animal dog1 = new Dog();
		dog1.speaks();
	}

}

class Lion extends Animal{
	public void speaks() {
		System.out.println("Lion roars");
	}
}

class Dog extends Animal{
	public void speaks() {
		System.out.println("Dog barks");
	}
}
