package numbersprogram;

public class Primeno1to25 {
	
	public static void main(String[] args) {
		
		int n=25;
		
		System.out.println("prime numberbetween 1 to 25");
		
		//loop through the number one by one
		
		for(int i=1; i<25; i++) {
			
			boolean isPrime=true;
			
			for (int j=2; j<i; j++)   {
				
				if(i%j==0)  {
					isPrime=false;
					break;
					}
				}
			if(isPrime)
				
				System.out.println(i+"");
			}
		
	}
		

}

