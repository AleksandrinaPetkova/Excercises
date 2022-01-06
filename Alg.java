package Alg;

import java.util.Arrays;

public class Alg {
public static void main (String[] args) {
	int[] arr = {6,82,12,1,4,59,-32,61};
	//bubleSort(arr);
	selectionSort(arr);
	System.out.println(Arrays.toString(arr));
	
}
private static void selectionSort(int[] arr) {
	for (int sortedCount = 1; sortedCount < arr.length; sortedCount++) {
		int maxIndex = 0;
		for (int i = 0; i <= arr.length - sortedCount; i++) {
			if (arr[i]>arr[maxIndex]) {
				maxIndex = 1;
			
			}
			
			int temp = arr[maxIndex];
			arr[maxIndex] = arr[arr.length - sortedCount];
			arr[arr.length - sortedCount] = temp;
		}
		
	}
}
private static void bubleSort(int[] arr) {
	
    for (int i = 0; i < arr.length; i++) {
    	
    	boolean hasSwap = false;
    	
		for (int j = 0; j < arr.length -1 - i; j++) {
			if (arr[j]> arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
				hasSwap = true;
			}
		}
		if(!hasSwap) {
			break;
		}
	}	
}
 
}
