package collection;

import java.util.Hashtable;
import java.util.Map;

public class Table1 {  
	
	public static void main(String[] args) {
		
		
		Hashtable<Integer,String>  table=new Hashtable<Integer,String>  ();
		
		table.put(null, "Mumbai");
		table.put(24, "Pune");
		table.put(36, "Delhi");
		table.put(78, "Hyderrabad");
		table.put(23, "Noida");
		
		for(Map.Entry<Integer, String>f:table.entrySet())  {
			
			System.out.println("Key" + f.getKey() + "Value=" + f.getValue());
		}
		
		
		}
		}



