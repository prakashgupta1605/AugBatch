package ExceptionHandling;

public class ThrowDemo {

	public static void main(String[] args) throws Exception {
		int rollNo = Integer.parseInt(args[0]);
		if(rollNo<=0) {
			throw new Exception("-ve roll no: "+ rollNo);
		}

	}

}
