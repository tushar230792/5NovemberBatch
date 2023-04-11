package string;

public class Whitespace {
	
	public static void main(String[] args) {
		
		String ad="ABAABABAB";
		
		int total=0;
		
		for (int i=0; i<=ad.length()-1; i++)  {
			
			char s=ad.charAt(i);
			
			if (s=='B')  {
				
			total ++;
			
			}
		}
	   System.out.println(total);
	
	}
}
