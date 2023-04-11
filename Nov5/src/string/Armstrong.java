package string;

public class Armstrong {

	public static void main(String[] args) {
		
		int orig=153;   // 1+125+27=153
		
		int add=0;
		
		for (int i=orig; i>0; i=i/10)   {
			
			int remainder=i%10;   //3
			
			add=add+(remainder*remainder*remainder);
		}
		
		if (orig==add)  {
			
			System.out.println("Given number is armstrong number");
		
		}
		
		else {
			System.out.println("Given number is not armstrong");
		}
		
	}
}
			
		
			
			
		
	

