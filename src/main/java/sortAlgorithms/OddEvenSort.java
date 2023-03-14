package sortAlgorithms;

import java.util.List;

public class OddEvenSort {

	private void swap(List<Integer> arr, int i) {
		int aux = arr.get(i);
		arr.set(i, arr.get(i+1));
		arr.set(i+1, aux);
	}
	
	public List<Integer> oddEvenSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		boolean isOrdered = false;
		while(!isOrdered) {
			isOrdered = true;
			for(int i=1; i<arr.size()-1; i+=2) {
				if(arr.get(i) > arr.get(i+1)) {
					swap(arr, i);
					isOrdered = false;
				}
			}
			
			for(int i=0; i<arr.size()-1; i+=2) {
				if(arr.get(i) > arr.get(i+1)) {
					swap(arr, i);
					isOrdered = false;
				}
			}
		}
		
		return arr;
	}
	
}
