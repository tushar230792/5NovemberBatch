package collection;

import java.util.HashSet;

public class AllCollection4 {
	
	public static void main(String[] args) {
		
		
			
			
			
			HashSet set=new HashSet ();
			
			set.add("ABCD");
			set.add('%');
			set.add(1234);
			set.add(null);
			set.add('$');

			System.out.println(set);
			
			for(Object  s:set)  {
				
				System.out.println(s);
			}
			
		}

	}

		
	


