package ExceptionHandling;

public class NegetiveRollNoException extends Exception{
	public NegetiveRollNoException(int rollNo) {
		System.out.println("-ve roll no: "+ rollNo);
	}
	
	public static void main(String...args) throws NegetiveRollNoException {
		int rollNo = Integer.parseInt(args[0]);
		if(rollNo<=0) {
			throw new NegetiveRollNoException(rollNo);
		}
	}
	
}
