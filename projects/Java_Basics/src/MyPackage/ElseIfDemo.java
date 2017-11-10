package MyPackage;

public class ElseIfDemo {

	public static void main(String[] args) {
		int percentage = Integer.parseInt(args[0]);
		boolean isPassed = false;
		char grade = 'D';
		// find whether student is passed
		if(percentage>=40) {
			isPassed = true;
		}
		else {
			isPassed = false;
		}		
		System.out.println("Student passed: "+ isPassed);
		
		//calculate grade
		if (percentage>=40 && percentage <60) {
			grade = 'C';
		} 
		else if (percentage>=60 && percentage <80) {
			grade = 'B';
		}
		else if (percentage>=80) {
			grade = 'A';
		}
		System.out.println("Student's grade is "+ grade);
		
	}

}
