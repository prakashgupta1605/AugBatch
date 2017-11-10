package MyPackage;

public class SwitchCaseDemo {

	public static void main(String[] args) {
    String grade = args[0];
    
    switch (grade) {
	case "A":
		System.out.println("Marks are > 80");
		break;
	case "B":
		System.out.println("Marks betn 60 - 80");
		break;
	case "C":
		System.out.println("Marks betn 40 - 60");
		break;
	default:
		System.out.println("Student is failed");
		break;
	}
		

	}

}
