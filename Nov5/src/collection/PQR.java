package collection;



public class PQR <G,L>   {
	
	G b;
	
	G Demo(L x)   {
		
		System.out.println(x);
		return b;
	}
		
		public static void main(String[] args) {
			
			PQR <Integer,String> y=new PQR <Integer,String> ();
			
			y.b=890;
			
			int z=y.Demo("Automation");
			System.out.println(z);
			
		}
	}
