package Interfacetesting;

public class Set implements Test{
	
	public void Define()   {     // complete method or implemented method
		
		System.out.println("method define is running");
	}
	

public void  setup()    {    
	
	System.out.println("method setup is running");
}

public static void main(String[] args) {
	
Set x=new Set();       //object of implementataion class

x.setup();
x.Define();

}
}
