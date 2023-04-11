package statement;

public class Ifelseif {           // ladder if
	
	public static void main(String[] args)   {
		
		String projectdomain="healthcare";
		
		if(projectdomain=="healthcare") {
			System.out.println("medical related work");
		}
		
		else if(projectdomain=="banking") {
			System.out.println("money tranction related work");
		}
		
		else  if(projectdomain=="telecomm") {
			System.out.println("communication  related work");
		}
		
		else if(projectdomain=="booking portal") {
			System.out.println("works related  to ticket booking");
		}
		
		else {
			System.out.println("random project domain");
		}
	}
	
}

