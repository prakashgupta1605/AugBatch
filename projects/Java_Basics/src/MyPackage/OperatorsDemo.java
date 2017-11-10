package MyPackage;
public class OperatorsDemo {
	public static void main(String...strings){
		int a = 10;
		
		//Unary operators
		// postfix and prefix
		System.out.println("postfix: "+a++);
		System.out.println("after postfix: "+a);
		System.out.println("prefix: "+ ++a);
		
		boolean bool1 = true; 
		System.out.println("~ "+ ~a);
		System.out.println("! "+ !bool1);
		
		a=13;
		int b=2;
		
		//arithmatic
		System.out.println("Addition: "+ (a+b));
		System.out.println("Substraction: "+ (a-b));
		System.out.println("Multiplication: "+ (a*b));
		System.out.println("Division: "+ (a/b));
		System.out.println("Mod: "+ (a%b));
		
		//Relational
		System.out.println(">="+ (a>=b));
		System.out.println("<="+ (a<=b));
		System.out.println("=="+ (a==b));
		System.out.println("!="+ (a!=b));
		
		//logical
		System.out.println("&&"+ (a>b && a!=b));
		System.out.println("||"+ (a>b || a!=b));
		
		//assignment
		System.out.println("a+=10 or a=a+10: "+ (a+=10));
		
		
		
	}
}
