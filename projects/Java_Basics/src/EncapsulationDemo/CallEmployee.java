package EncapsulationDemo;

public class CallEmployee {

	public static void main(String...strings) {
		Employee emp1 = new Employee(1);
		//emp1.empId = 2;
		System.out.println(emp1.getEmpId());
	}
}
