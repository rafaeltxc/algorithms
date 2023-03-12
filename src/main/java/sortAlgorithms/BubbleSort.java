package sortAlgorithms;

import java.util.List;

public class BubbleSort {

	public List<Integer> bubbleSort(List<Integer> arr) {
		if (arr.size() <= 1) { return arr; }
		
		int aux;
		for (int i=0; i<arr.size(); i++) {
			for (int j=i; j<arr.size(); j++) {
				if (arr.get(i) > arr.get(j)) {
					aux = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, aux);
				}
				
			}
		}
		
		return arr;
	}
	
}
