package Abstraction;
public class Circle implements Shape{

	@Override
	public void getArea() {
		System.out.println("Pi*r^2");
		
	}

	@Override
	public void getPerimeter() {
		System.out.println("2*pi*r");
		
	}

}
