package set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {

	public static void main(String[] args) {
      Map<Integer, Integer> result = new HashMap<Integer, Integer>();
    
      Integer[] arr = {2, 2, 3, 3, 2,4, 2,4, 5, 5};
      
      for (int i = 0; i <= arr.length-1; i++) {
    	  if (!result.containsKey(arr[i])) {
    		  result.put(arr[i],1);
			
		}else {
			result.put(arr[i], result.get(arr[i])+ 1);
		}
		
	}
      for (Integer key : result.keySet()) {
    	  System.out.println(key + " -> " + result.get(key));
		
	}
      
	}

}
