package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTypes {

	public static void main(String[] args) {
		//unchecked exception
		String s1;
		try {
			s1 = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			s1="";
		}
		
		//checked exception
		File file = new File("C:/abc.txt");
		try {
			FileReader reader = new FileReader(file);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
