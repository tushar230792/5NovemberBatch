package Array;

public class sortarray1 {  //without arraysort method
	
	int [] a = {22,55,33,89};
	
	int temp =0;  {
	 
	 
	for(int i = 0; i<a.length;i++) {
		
		for(int j =0; j<a.length;j++) 
			
			if(a[i]<a[j]) {
				
				
	temp = a[i]; a[i]=a[j]; a[j]=temp;    /// switching position if condition is true } } 
	
	
	for(int k = 0; i<a.length;i++)   
		
		System.out.println(a[i]);  /// display after sorting 
			}
	}

}
}
