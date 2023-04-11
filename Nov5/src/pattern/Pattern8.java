package pattern;

public class Pattern8 {
	
	public static void main(String[] args) {

		 int num=5;
		 int space=4;
		 
		 for(int i=1;i<=5; i++)  {
			 
			for(int k=1; k<=space; k++)  {
				
				System.out.print(" ");
			}
			 
			 
				 
				 for(int j=num;j<=5; j++) {
				 
			 System.out.print(j+" ");
				 }
			 System.out.println();
			 
			 num--;
			 space--;
	  }
	}

		
	}


