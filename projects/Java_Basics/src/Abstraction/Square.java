package Abstraction;

public class Square implements Shape{

	@Override
	public void getArea() {
		System.out.println("l^2");
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("l*4");
		
	}

}
