package allvariableprog;

public class Variableprog1 {
	
	static int z = 1000; // static global variable
	
	public static void sum ()
	{
		int a=10,b=20,c;
		c=a+b;
		
		System.out.println("A = " + a);
		System.out.println(" Z = " + z);
		
		System.out.println("The addition of this two number is = "+ c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		System.out.println(" A = " + a);
		sum();
		System.out.println(" Z = " + z);
		
		
		

	}

}
