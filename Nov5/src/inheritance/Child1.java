package inheritance;

public class Child1  extends Child {
	
	public void cycle()    {                       // multilevel inheritance
		System.out.println("cycle");
	}
	
	 public static void main(String[]  args)    {
		   
		   Child1 x=new Child1();
		   
		   x.cycle();
		   x.bike();
		   x.car();
		   x.home();
		   x.money();
	   }
	}


