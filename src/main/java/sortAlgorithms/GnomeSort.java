package sortAlgorithms;

import java.util.List;

public class GnomeSort {

	public List<Integer> gnomeSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		int idx = 0;
		while(idx < arr.size()) {
			if(idx == 0 || arr.get(idx) > arr.get(idx-1)) {
				idx++;
			} else {
				arr.add(idx-1, arr.remove(idx));
				idx--;
			}
		}
		
		return arr;
	}
	
}
