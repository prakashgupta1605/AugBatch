package ExceptionHandling;

public class HandleException {

	public static void main(String[] args) {
		//handle array out of bound exception
		String s1;
		try {
			s1 = args[0];
		} catch (ArrayIndexOutOfBoundsException e) {
			s1="";
		}
		// handle null pointer exception
		String s2 = null;
		int length;
		try {
			length = s2.length();
		} catch (NullPointerException e) {
			length = 0;
		}
		System.out.println("string length:"+ length);
		
	}

}
