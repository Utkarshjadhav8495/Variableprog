package allvariableprog;

public class variableprog2 {
	
	static int x = 1000; // static global variable
	
	int y= 100;  // non static global variable
	
	public void mul()
	
	{
	
	int a=10,b=11,c;
	c=a*b;
	int x=500;
	int y= 200;
		
	System.out.println("X="+ x);
	System.out.println("Y " + y);
	System.out.println(" A=" + a);
	System.out.println("The multiplication of this two number is = " + c);
	
	
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("Y= "+ y);   Static method cannot access non static variable
		System.out.println("X = " + x);
		
		variableprog2 k = new variableprog2();
		k.mul();
		

	}

}
