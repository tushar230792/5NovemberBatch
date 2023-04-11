package Counstructer;

public class Any2 {
	
	static int test()  {
		
		int a=15;
		int b=65;
		int c=a+b;
		return(c);
		}
	
	void demo()  {
		System.out.println("non static method is running");
	}
	
	public static void main(String[] args)    {
		
		Any2 x=new Any2();
		System.out.println(test());
		test();
		x.demo();
	}

}
