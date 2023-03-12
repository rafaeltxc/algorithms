package sortAlgorithms;

import java.util.List;

public class ShakerSort {

	public List<Integer> shakerSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		int aux;
		boolean isOrdered = false;
		for(int i=0; i<arr.size()-1; i++) {
			if (arr.get(i) > arr.get(i+1) ) {
				aux = arr.get(i+1);
				arr.set(i+1, arr.get(i));
				arr.set(i, aux);
				isOrdered = true;
			}
		}
		
		for(int i=arr.size()-1; i>1; i--) {
			if(arr.get(i) < arr.get(i-1)) {
				aux = arr.get(i-1);
				arr.set(i-1, arr.get(i));
				arr.set(i, aux);
				isOrdered = true;
			}
		}
		
		if(isOrdered) {
			shakerSort(arr);
		}
		
		return arr;
	}
	
}
