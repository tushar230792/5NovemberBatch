package Interfacetesting;

public class Implements implements Staticinterface {
	
	public void show()    {
		
		System.out.println("method show is running");
	}
	
	public static void main(String[] args) {
		
		Implements c =new Implements ();
		
		c.show();
		
		Staticinterface.xyz();
	}

}
