package sortAlgorithms;

import java.util.List;

public class InsertionSort {

	public List<Integer> insertionSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		for(int i=1; i<arr.size(); i++) {
			if(arr.get(i) < arr.get(i-1)) {
				for(int j=i; j!=0 && arr.get(j)<arr.get(j-1); j--) {
					arr.add(j-1, arr.remove(j));
				}
			}
			
		}
		return arr;
	}
	
}
