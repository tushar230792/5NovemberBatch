package method;

public class Argument2 {
	
	public static void addition (int a,int b)  { //static method with argument
		int c=a+b;
		System.out.println("addition =" + c);
	}
		
		public static void subtraction (int a,int b)  { //static method with argument
			int c=a-b;
			System.out.println("subtraction =" + c);
		}
		
		public static void multiplication (int a,int b)  { //static method with argument
			int c=a*b;
			System.out.println("multiplication =" + c);
		}
		
		public static void division (int a,int b)  { //static method with argument
			int c=a/b;
			System.out.println("division =" + c);
		}
			
	
	public static void main(String[] args)  {
		
		addition (70,86);
		subtraction(40,30);
		multiplication (30,20);
		division       (60,30);
	
		
	}
}


	
	


