package Inheritance;

public class Labor extends Employee{
	public Labor(String name) {
		super(name);
	}	
	int workingHours;
	double wages;
	public int getWorkingHours() {
		return workingHours;
	}
	public void setWorkingHours(int workingHours) {
		this.workingHours = workingHours;
	}
	public double getWages() {
		return wages;
	}
	public void setWages(double wages) {
		this.wages = wages;
	}
	
	public double getDailyWage() {
		return workingHours*100;
	}
	
	public static void main(String...strings ) {
		Labor labor1 = new Labor("lab1");
		System.out.println("Labor 1 id: "+ labor1.getEmpId());
		Employee emp1 = new Labor("lab2");
		System.out.println("Labor 2 id: "+ emp1.getEmpId());
	}

}
