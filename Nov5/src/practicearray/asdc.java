package practicearray;

import java.util.Arrays;

public class asdc {
	
	public static void main(String[] args) {
	
	int a[]= {20,15,25,40,55,12};

		System.out.println("******all info in array******");
		
		for(int i=0; i<=a.length-1; i++) {
			
			System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		
		System.out.println("******all info array asending******");
		
		for(int i=0; i<=a.length-1; i++)   {
			
			System.out.println(a[i]);
		}
		
		System.out.println("******all info array decending******");
		
		for(int i=a.length-1; i>=0; i--)   {
			
			System.out.println(a[i]);
		}
		
		
		
		
	}
}

