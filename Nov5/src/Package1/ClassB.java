package Package1;

public class ClassB {
	
	public static void main (String [] args)    {
		
		ClassA z= new ClassA();
		
		System.out.println(z.a);   //calling variable with  public access specifier;
		//System.out.println(Z.b);   //calling variable with  private access specifier;
		System.out.println(z.c);   //calling variable with  protected  access specifier;
		System.out.println(z.d);   //calling variable with  default  access specifier;
		
	}
	
}
		
	


