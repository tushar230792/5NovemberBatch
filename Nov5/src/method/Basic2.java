package method;

public class Basic2 {         // non static method declare in same class
	                         // and call in same class
	
	public  void demo()  {      //user define non static  method declearation
		System.out.println("demo method running");
	}
	
	public static void test () {          //user  define static method
		System.out.println("test  method running");
		
	}
	
	public static void main(String[] args)   {
		
		Basic2 x =new Basic2();
		
		x.demo();         //non stic method calling in same class
		
		test ();           //static method calling same class
	}

}


