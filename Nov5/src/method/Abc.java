package method;

public class Abc {
	   
	   static int demo() {             // user define method declration
		   
		   int x=78;
		   int y=65;
		   int z=x+y;
		   return z;
	   } 
	   
	   static String Test()  {                  // user define method decleration
		   return "Testing";
	   }
		  
	  public static void main (String[] args)   {
		  System.out.println("abcde");
		 
		  int z=demo();                 //user definemethod int type data
		  System.out.println(z);
		  
		  String a = Test();             //user define method string type data
		  System.out.println(a);
		 
	  }
		  
}



