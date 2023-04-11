package method;

public class Argument1 {
	
		
		public  void multiplication(int a,int b)  { // non static method with argument
			int c=a*b;
			System.out.println("Multiplication ="+ c);
		}
		
		public static void addition ()    {
			int a=80;
			int b=90;
			int c=a+b;
			System.out.println(c);
			
		}
  
		
		public static void main(String[] args)  {
			
			addition ();
			
			Argument1 x =new Argument1 ();
			
			x.multiplication(70,86);
			x.multiplication(40,30);
			x.multiplication(30,21);
			
	
			
		}
	}





