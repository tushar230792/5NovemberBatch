package pattern;

public class Statnonstat {
	
	static int a=10;        //static variable
	int        b=20;        // non static variable 
	
	
	public static void main(String[] args)    {
		
		System.out.println("static variable=" +a);  //10
		
		Statnonstat x=new Statnonstat ();
		System.out.println(" non static variable with ref of x=" +x.b );   //20
		
		Statnonstat y=new Statnonstat ();
		System.out.println(" non static variable with ref of y=" +y.b );   //20
		
		x.b=30; 
		System.out.println(" non static variable with ref of x=" +x.b );   //30
		System.out.println(" non static variable with ref of x=" +y.b );   //20
		
		System.out.println("  static variable with ref x=" +x.a);  //10
		System.out.println("  static variable with ref y=" +y.a);   //10
		
		x.a=50;
		System.out.println("  static variable with ref of x updated x=" +x.a );  //50
		System.out.println("  static variable with ref of y updated y=" +y.a );    //50
		
		
		
		
		
		
	}

}
