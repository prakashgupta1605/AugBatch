package Inheritance;
public class Employee {
	//State
	int empId;	
	String name;
	float currentExp, totalExp;
	int age;
	double salary;
	static int totalEmployees = 0;	
	//constructor to initialize your object
	public Employee(String name) {
		this.empId = ++totalEmployees;
		this.name = name;
	}	
	
	public Employee(String name, int age, float totalExp) {
		this.empId = ++totalEmployees;
		this.name = name;
		this.age = age;
		this.totalExp = totalExp;
	}
	
	public float getCurrentExp() {
		return currentExp;
	}
	public float getTotalExp() {
		return totalExp;
	}
	public int getEmpId() {
		return empId;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setTotalExp(float totalExp) {
		this.totalExp = totalExp;
	}			
	//Behaviour
	public double getSalary() {
		double salary = totalExp*10000;
		return salary;
	}
	
	public boolean eligibleForAppraisal(float exp) {
		boolean isEligible = false;
		if(exp>1) {
			isEligible = true;
		}
		return isEligible;
	}
	
	public static void main(String...strings) {
		
	}

}
