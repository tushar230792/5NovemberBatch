package string;

public class Reverse {  //reverse the string 
	
	public static void main(String[] args) {
		
		String a="Testing";  //7-1=6
		String reverse= "";
		
		for (int i=a.length()-1; i>=0; i--)  {
	       reverse = reverse+a.charAt(i);
	       
	}
	       
         System.out.println(reverse);
         
}

}
	 

