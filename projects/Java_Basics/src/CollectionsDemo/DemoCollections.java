package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import MyPackage.Employee;
public class DemoCollections {
	public static void main(String[] args) {
		Employee emp1 = new Employee("emp1");
		Employee emp2 = new Employee("emp2");
		//ArrayList. Ordered collection, allows duplicate values
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp1);
		System.out.println("Total employees count: "+ employeeList.size());
		System.out.println("Emp2 id: "+ employeeList.get(1).getEmpId());
		for (Employee employee : employeeList) {
			System.out.println(employee.getName());
		}		
		//HashSet. Unordered. Doesn't allow duplicate values
		Set<Employee> employeesSet = new HashSet<Employee>();
		employeesSet.add(emp1);
		employeesSet.add(emp2);
		employeesSet.add(emp1);
		//iterate using foreach loop
		for (Employee employee : employeesSet) {
			System.out.println(employee.getName());
		}
		//Iterate using Iterator
		Iterator<Employee> iterator = employeesSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getName());			
		}		
		//Hashmap. store values with key value pair. 
		Map<Integer, Employee> employeesMap = new HashMap<>();
		employeesMap.put(emp1.getEmpId(), emp1);
		employeesMap.put(emp2.getEmpId(), emp2);
		employeesMap.put(3, new Employee("emp3"));
		System.out.println("Employee name with emp id 2: "+ employeesMap.get(2).getName());
		for (Employee employee : employeesMap.values()) {
			System.out.println(employee.getName());
		}
		
		

	}

}
