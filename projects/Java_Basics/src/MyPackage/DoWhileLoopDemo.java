package MyPackage;

public class DoWhileLoopDemo {

	public static void main(String[] args) {
		
		//print 0 to 1
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
		
		
		
		// calculate percentage using while loop
		int[] quarterMarks = new int[4];
		quarterMarks[0] = 50;
		quarterMarks[1] = 60;
		quarterMarks[2] = 30;
		quarterMarks[3] = 45;
		boolean isPassed = true;
		
		int totalMarks = 0;	
		i=0;
		do {
			if(quarterMarks[i]<40) {
				isPassed = false;
				break;
			}
			totalMarks = totalMarks + quarterMarks[i];
			i++;
		}while (i< quarterMarks.length && isPassed);
		
		if(!isPassed) {
			System.out.println("Student is failed");
			return;
		}
		float percentage = (float)totalMarks/quarterMarks.length;
		System.out.println("Percentage: "+ percentage);

	}

}
