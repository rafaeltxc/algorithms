package sortAlgorithms;

import java.util.List;

public class SelectionSort {

	public List<Integer> selectionSort(List<Integer> arr) {
		int temp;
		for(int i=0; i<arr.size(); i++) {
			int aux = i;
			for(int j=i+1; j<arr.size(); j++) {
				if(arr.get(j) <= arr.get(i) && arr.get(j) <= arr.get(aux)) {
					aux = j;
				}
			}
			
			if(i != aux) {
				temp = arr.get(aux);
				arr.set(aux, arr.get(i));
				arr.set(i, temp);
			}
		}
		
		return arr;
	}
	
}
