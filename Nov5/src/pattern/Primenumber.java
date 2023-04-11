package pattern;

public class Primenumber {
	
	public static void main(String[] args) {
		
		int num=5;
		
		int count=0;
		
		for(int i=2; i<num; i++)   {
			
			int remainder=num%i;
			
			if (remainder==0)  {
				
				count++;
			}
		}
		 if (count>0)  {
			 
			 System.out.println("Not prime");
		 }
		 
		 else {
			 
			 System.out.println("Prime number");
			 
		 }
		 }
}
				
		
