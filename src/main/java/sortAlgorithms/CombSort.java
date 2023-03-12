package sortAlgorithms;

import java.util.List;

public class CombSort {

	public List<Integer> combSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		for(int gap=(int) Math.floor(arr.size()/2); gap>0; gap--) {
			for(int i=0; i<arr.size()-gap; i++) {
				if(arr.get(i) > arr.get(i+gap)) {
					int temp = arr.get(i);
					arr.set(i, arr.get(i+gap));
					arr.set(i+gap, temp);
				}
			}
		}
		
		return arr;
	}
	
}
