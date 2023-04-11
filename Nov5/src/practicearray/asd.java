package practicearray;

import java.util.Arrays;

public class asd {
	
	public static void main(String[] args) {
		
		int a  []= {11,33,76,38,36,23,68};
		
		System.out.println("*******all info in array");
		
		for(int i=0; i<=a.length-1; i++)   {
			
			System.out.println(a[i]);
			
		}
			
			Arrays.sort(a);
			
			System.out.println("*******all info in array acending********");
			
			for( int i=0; i<=a.length-1; i++)  {
				
				System.out.println(a[i]);
			}
				
				System.out.println("*******all info in array decending********");
				
				for(int i=a.length-1; i>=0; i--)   {
					
					System.out.println(a[i]);
						
				
				
			}
		}
		
	}


