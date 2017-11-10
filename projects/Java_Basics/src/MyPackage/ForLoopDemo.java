package MyPackage;

public class ForLoopDemo {

	public static void main(String[] args) {
		
		//print 0 to 1
		for (int i = 0; i < 10; i++) {
			System.out.println(i+"\n");
		}
		
		
		// calculate percentage using for loop
		int[] quarterMarks = new int[4];
		quarterMarks[0] = 50;
		quarterMarks[1] = 60;
		quarterMarks[2] = 30;
		quarterMarks[3] = 45;
		
		int[][] subjectWiseMarks = {{30,40,50,60},{20,50,48,90}};		
		for(int i=0; i<2;i++) {
			for(int j=0;j<subjectWiseMarks.length;j++) {
				System.out.println(subjectWiseMarks[i][j]);
			}
		}
		
		
		
		//for each loop
		for (int marks : quarterMarks) {
			System.out.println(marks);
		}
		
		int totalMarks = 0;		
		for(int i = 0; i< quarterMarks.length; i++) {
			totalMarks = totalMarks + quarterMarks[i];
		}
		
		float percentage = (float)totalMarks/quarterMarks.length;
		System.out.println("Percentage: "+ percentage);

	}

}
