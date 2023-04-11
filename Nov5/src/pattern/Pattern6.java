package pattern;

public class Pattern6 {
	
public static void main(String[] args)          {
		
		int space=4;
		int Star=1;
		
		for(int i=1;i<=5;i++)   {
			
		for( int j=1; j<=space; j++)  {
			System.out.print((" "));
		}
		
		for(int k=1; k<=Star; k++)   
		System.out.print("*");
		System.out.println();
		space--;
		Star++;
	
		
		}
	}
}


