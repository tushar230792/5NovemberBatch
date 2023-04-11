package string;

public class palindrome2 {
	
	public static void main(String[] args) {
		
		String a="WOW";
		
		String pal="";
		
		for(int i=a.length()-1;  i>=0; i--)  {
			
			pal=pal+a.charAt(i);
			
			
		}
		if (a.equals(pal))   {
			
			System.out.println("Given string is pallindrome");
		}
			
			else  {
				
				System.out.println("Given string is not pallindrome");
				
				
			}
		}
	}


