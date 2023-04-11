package numbersprogram;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void main(String[] args) {
		
		java.util.Scanner sc=new java.util.Scanner(System.in);
		
	//	Scanner  demo= new Scanner (System.in);         // scanner class object
		
		System.out.println("enter value of num");
		
		int num=sc.nextInt();
		
		for(int i=1; i<=5; i++)   {
			
				for(int j=1; j<=10; j++) {
				
					System.out.println(j+"*"+i+"="+j*i+"\t");
				}
		}
				System.out.println();
			}
			
			
}

