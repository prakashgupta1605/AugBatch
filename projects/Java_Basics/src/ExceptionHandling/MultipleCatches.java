package ExceptionHandling;

public class MultipleCatches {

	public static void main(String[] args) {
		String s1;
		String s2 = null;
		int length;
		try {
			System.out.println(10/0);
			s1 = args[0];
			length = s2.length();
		}catch (ArrayIndexOutOfBoundsException e) {
			s1="";
		}catch (NullPointerException e) {
			length = 0;
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
