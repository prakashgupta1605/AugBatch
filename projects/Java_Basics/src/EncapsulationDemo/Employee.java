package EncapsulationDemo;

public class Employee {	
	public Employee(int empId) {
		this.empId = empId;
	}
	public Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	private int empId;	
	private String empName;
	private double salary;
	private float experience;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public String getEmpName() {
		return empName;
	}

	public int getEmpId() {
		return this.empId;
	}	

}
