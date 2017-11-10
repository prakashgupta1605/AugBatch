package MyPackage;

public class FunctionsDemo {
	
	static float calculatePercentage(int[] quarterMarks) {
		int totalMarks = 0;		
		for(int i = 0; i< quarterMarks.length; i++) {
			totalMarks = totalMarks + quarterMarks[i];
		}		
		float percentage = (float)totalMarks/quarterMarks.length;
		return percentage;
	}
	
	static boolean isStudentPassed(int[] quarterMarks) {
		boolean isPassed = false;
		float percentage = calculatePercentage(quarterMarks);
		if(percentage>=40) {
			isPassed = true;
		}
		return isPassed;
	}

	public static void main(String[] args) {	
		// calculate percentage using for loop
		int[] quarterMarks1 = {50,60,30,45};	
		float percentage = calculatePercentage(quarterMarks1);
		System.out.println("Percentage of student 1: "+ percentage);
		System.out.println("Student1 passed: "+ isStudentPassed(quarterMarks1));

		int[] quarterMarks2 = {50,30,10,45};	
		percentage = calculatePercentage(quarterMarks2);
		System.out.println("Percentage of student 1: "+ percentage);
		System.out.println("Student2 passed: "+ isStudentPassed(quarterMarks2));
		

	}

}
