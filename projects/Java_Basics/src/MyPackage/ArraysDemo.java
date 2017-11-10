package MyPackage;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] quarterMarks = new int[4];
		String[] subjects = {"Science","Maths"};

		quarterMarks[0] = 50;
		quarterMarks[1] = 60;
		quarterMarks[2] = 30;
		quarterMarks[3] = 45;
		
		System.out.println("Quarter1 marks: "+ quarterMarks[0]);
		
		int totalMarks = quarterMarks[0] + quarterMarks[1] + quarterMarks[2] + quarterMarks[3];
		
		System.out.println("Average marks" + (float)totalMarks/quarterMarks.length);
		
		int[][] subjectWiseMarks = {{30,40,50,60},{20,50,48,90}};

		System.out.println(subjectWiseMarks[0][0]);
		System.out.println(subjectWiseMarks[0][1]);
		System.out.println(subjectWiseMarks[0][2]);
		System.out.println(subjectWiseMarks[0][3]);
		System.out.println(subjectWiseMarks[1][0]);
		System.out.println(subjectWiseMarks[1][1]);
		System.out.println(subjectWiseMarks[1][2]);
		System.out.println(subjectWiseMarks[1][3]);
		

	}

}
