package Interfacetesting;

public interface Default {
	
	// Default method of interface
	//Default is akeyword not acess specifier 
	//mart method is bydefault public
	
	public default void mart()   {
		
		System.out.println("shops");
	}
	
	public static void XYZ ()     {   //complete static method
		
		System.out.println("static method of interfacae is running");	
	}
	
	public void show();              //incomplete method of interface
    
}
