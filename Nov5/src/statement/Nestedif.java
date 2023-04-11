package statement;

public class Nestedif {
	
	public static void main(String[]args ) {
		
		String UN="XYZ";
		String PWD="a@123";
		
		if (UN=="XYZ") {
			System.out.println("correct username");
		
		
		if (PWD=="a@12") {
			System.out.println(" password is correct ");
			System.out.println("login sucessful");
		}
		
		else {
			System.out.println(" password is incorrect ");
			System.out.println("login failed");
		}
		
	}
	
	    else    {
		System.out.println(" incorrect username ");
		System.out.println("login failed");
	}
}
}


