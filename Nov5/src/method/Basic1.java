package method;

public class Basic1 {         //static method declare in same class
	                           //and call in same class
	
	public static void demo()  {      //user define method declearation
		System.out.println("demo method running");
	}
	
	public static void test () {
		System.out.println("test  method running");
		
	}
	
	public static void main(String[] args)   {
		
		demo();
		test();
	}

}

