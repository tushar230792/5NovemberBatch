package method;

public class Argument {
	
	public static void addition(int a,int b)  { //static method with argument
		int c=a+b;
		System.out.println("addition =" + c);
	}

	
	public static void main(String[] args)  {
		
		addition (70,86);
		addition (40,30);
		addition (30,20);
	}
}


