package sortAlgorithms;

import java.util.Collections;
import java.util.List;

public class BogoSort {

	private boolean isOrdered(List<Integer> arr) {
		for(int i=1; i<arr.size(); i++) {
			if(arr.get(i) < arr.get(i-1)) {
				return false;
			}
		}
		
		return true;
	}
	
	public List<Integer> bogoSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		while(true) {
			Collections.shuffle(arr);
			System.out.println(arr);
			if(isOrdered(arr)) {
				break;
			}
			
		}
		
		return arr;
	}
	
}
