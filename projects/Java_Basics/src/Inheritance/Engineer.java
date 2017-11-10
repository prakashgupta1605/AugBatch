package Inheritance;

public class Engineer extends Employee{

	public Engineer(String name) {
		super(name);
	}
	
	String[] skills;
	float rating;
	
	public double getSalary() {
		getSalary();
		return rating*super.getSalary();
	}
	
	
	public static void main(String...strings) {
		Engineer engg1 = new Engineer("engg1");
		engg1.getSalary();
	}

}
