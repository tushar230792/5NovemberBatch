package inheritance;

public class Child extends Parent {                 // single level inheritance
	
	public void bike()   {
		System.out.println("bike");
	}


  public static void main(String[]  args)    {
	   
	   Child x=new Child();
	   
	   x.bike();
	   x.car();
	   x.home();
	   x.money();
   }
}
	   
   