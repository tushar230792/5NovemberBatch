package Counstructer;

public class Any1 {
	
	static int test()   {
		return(10);
	}
	
	void demo()   {
		System.out.println("non static method is running");
	}
	
	public static void main(String[] args)  {
		
		Any x=new Any();
		System.out.println(10);
		x.demo();
	}

}
