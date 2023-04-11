package pattern;

public class pattern10 {
	
public static void main(String[] args)   {
		
		int space=4;
		char alpha='E';
				
	    for(int i=1;i<=5; i++)  {
	    	
	    for(int j=1; j<=space; j++)  {
	    	System.out.print(" ");
	    }
	    for(char k=alpha; k<='E'; k++) 
	    	System.out.print(k+" ");
	    	  
	    
	    alpha--;
	    space--;
	    System.out.println(); 
	    }
	}
	}

	    	


