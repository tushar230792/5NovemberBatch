package inheritance;

public class Dog extends Animal {    //single level inheritance
	
	public void bark()      {
		
		System.out.println("barking");

	}


public static void main(String[]  args)    {
	
	Dog x=new Dog();
	
	x.bark();
	x.eat();
}
}
	   
	