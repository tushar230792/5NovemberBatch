package statement;

public class Ifelseif1 {        // ladder if
	
	public static void main(String[] args)   {
		
		int marks=89;
		
		if (marks>=75) {
			System.out.println("student pass in distinction");
		}
		
		else if (marks>=60) {
			System.out.println("student pass in  first class");
		}
		
		else if (marks>=50) {
			System.out.println("student pass in  second class");
		}
		
		else if (marks>=35) {
			System.out.println("student pass ");
		}
		
		else  {
			System.out.println("student fail");
		}
	}

}
