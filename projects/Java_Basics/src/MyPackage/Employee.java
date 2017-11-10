package MyPackage;
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
		Employee emp1 = new Employee("emp1");
		Employee emp2 = new Employee("emp2", 25, 5);
		System.out.println("Emp1 id: "+ emp1.getEmpId());
		System.out.println("Emp2 id: "+ emp2.getEmpId());
		System.out.println(emp1.getName());
		emp1.setTotalExp(3);
		System.out.println("Emp1 salary is: "+emp1.getSalary());
	}

}
