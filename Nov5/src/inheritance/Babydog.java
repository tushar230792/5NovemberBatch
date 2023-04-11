package inheritance;

public class Babydog  extends Dog {
	
	public void weep ()   {
		System.out.println("weeping");

	}



public static void main(String[]  args)    {
	
	Babydog x=new Babydog();
	
	x.bark();
	x.eat();
	x.weep();
}
}
