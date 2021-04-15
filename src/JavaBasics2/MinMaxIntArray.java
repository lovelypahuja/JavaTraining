package JavaBasics2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;



public class MinMaxIntArray {
	
	private static int calculateMax(Integer[]arr)
	{
		
		List<Integer> list= Arrays.asList(arr);
		int max = Collections.max(list);
		return max;
		 
		
		
		
		
	}

	
		public static void main(String[] args) {
	
		    
		        // Initializing array of integers
		        int[] num = {2, 4, 7, 5, 9,1,11};
		       Integer[] wrappers = ArrayUtils.toObject(num);
		       
		        
		 
		        // using Collections.min() to
		        // find minimum element
		        // using only 1 line.
		        ////int min = Collections.min(Arrays.asList(num));
		 
		        // using Collections.max()
		        // to find maximum element
		        // using only 1 line.
		        //int max = Collections.max(Arrays.asList(num));
		 
		        // printing minimum and maximum numbers
		        //System.out.println("Minimum number of array is : "
		                          // + min);
		        int result=calculateMax(wrappers);
		        System.out.println(result);
		       
		    }
		

	}


