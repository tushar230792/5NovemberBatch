package pattern;

public class p18 {
	
	public static void main(String[] args) {
		 char star='E';
		 
		 for(int i=1; i<=5; i++) {
			 
			 for(char j='A'; j<=star; j++)  {
				 System.out.print(j);
			 }
			 System.out.println();
			 star--;
			 }
		 }
	}


