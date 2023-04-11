package Counstructer;

public class basic3 {
	


		  int i;

		  // constructor with no parameter
		  private basic3() {
		    i = 5;
		    System.out.println("Constructor is called");
		  }

		  public static void main(String[] args) {

		    // calling the constructor without any parameter
		    basic3 obj = new basic3();
		    System.out.println("Value of i: " + obj.i);
		  }
		}


