package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {
	
	public static void readFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		FileReader reader = new FileReader(file);
	}

	public static void main(String[] args) {
		try {
			ThrowsDemo.readFile("C:/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
