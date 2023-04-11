package method;

public class Basic4 {                // calling from diffrent class
	
	
   public static void main(String[] args)              {
	   
	   Basic3.test();                  // static method call from diffrent class

	   Basic3  x=new Basic3();         // object creation
	   x.demo();                       // non static method call from diffrent class
   }
} 