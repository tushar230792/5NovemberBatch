package polymorphism;

public class Riding1 extends Riding   {        // overriding
	
	public void statement()    {
		
		System.out.println("method from subclass is running");
	}


	public static void main(String[] args) {
		
		Riding1 x=new Riding1() ;
		
		x.statement();
		
		Riding y =new Riding1();
		y.statement();
		
		
	}
}
	
