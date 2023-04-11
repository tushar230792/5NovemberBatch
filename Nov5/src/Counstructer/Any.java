package Counstructer;

public class Any   {

	
	static void test()   {
		
		System.out.println("static method is running");
	}
	void demo()   {
		System.out.println(" non static method is running");
	}
	
	public static void main(String[]  args)   {
		test();
		Any x =new Any ();
		x.demo();
		
	}
}

		
		
		

