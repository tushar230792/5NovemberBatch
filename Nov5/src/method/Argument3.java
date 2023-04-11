package method;

public class Argument3 {
	
	public  void multiplication(int a,int b)  { // non static method with argument
		int c=a*b;
		System.out.println("Multiplication ="+ c);
	}
	
	
	public  void addtion (int a,int b)  { // non static method with argument
		int c=a+b;
		System.out.println("addition ="+ c);
	}
	
	public static void addition ()    {
		int a=80;
		int b=90;
		int c=a+b;
		System.out.println(c);
		}
	
	public static void multiplication ()    {
		int a=80;
		int b=90;
		int c=a*b;
		System.out.println(c);
		
	}

	
	public static void main(String[] args)  {
		
		addition ();
		multiplication();
		
		Argument3 x =new Argument3 ();
		
		x.multiplication(70,86);
		x.multiplication(40,30);
		x.multiplication(30,21);
		
		x.addtion(30,40);
		x.addtion(50,30);
		x.addtion(30,30);
		
		
		
		
		

		
	}
}


