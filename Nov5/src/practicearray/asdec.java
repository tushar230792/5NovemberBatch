package practicearray;

import java.util.Arrays;

public class asdec {
	
	public static void main(String[] args) {
		
		int a []= {10,30,26,45,27,87,98};
		
		System.out.println("*********all info in array*********");
		
		for(int i=0; i<=a.length-1; i++) {
		
		System.out.println(a[i]);
		
		}
		
		Arrays.sort(a);
		
		System.out.println("*********all info in array asecding*********");
		
		for(int i=0; i<a.length-1; i++)  {
			
			System.out.println(a[i]);  }
			
			
			System.out.println("*********all info in array decending*********");
			
			for(int i=a.length-1; i>=0; i--)   {
				
				System.out.println(a[i]);
			}
			
			
			
			
		}
	}

		
		
		
		
		
		

		
		
		
		
		



