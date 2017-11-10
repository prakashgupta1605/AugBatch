package Abstraction;
public interface Shape {
	float pi = 3.14f;
	void getArea();
	void getPerimeter();
	
	public static void main(String...strings) {
		Shape circle1 = new Circle();
		Shape square1 = new Square();
		circle1.getArea();
		square1.getPerimeter();
	}
}
