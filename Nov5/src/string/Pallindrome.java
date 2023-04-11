package string;

public class Pallindrome {  // Pallindome the string
	
	public static void main(String[] args) {
		
		String a="RADAR";
		String reverse="";
		
		for (int i=a.length()-1; i>=0; i--)   {
			reverse=reverse+a.charAt(i);
		}
		
		if (a.equals(reverse))  {
		System.out.println("Given string is pallindrome");
	}
	
	    else {
		System.out.println("Given string is not pallindrome");
		
	    }
}
}