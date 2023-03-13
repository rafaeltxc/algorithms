package sortAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class StrandSort {
	
	private List<Integer> merge(List<Integer> arr1, List<Integer> arr2) {
		List<Integer> mergedList = new ArrayList<>();
		while(arr1.size() > 0 && arr2.size() > 0) {
			if(arr1.get(0) <= arr2.get(0)) {
				mergedList.add(arr1.remove(0));
			} else {
				mergedList.add(arr2.remove(0));
			}
		}
		
		if(arr1.size() > 0) {
			while(arr1.size() > 0) {
				mergedList.add(arr1.remove(0));
			}
		} else {
			while(arr2.size() > 0) {
				mergedList.add(arr2.remove(0));
			}
		}
		
		return mergedList;
	}

	public List<Integer> strandSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		List<Integer> auxList = new ArrayList<>();
		for(int i=0; i<arr.size(); i++) {
			if(i == 0) {
				auxList.add(arr.remove(i));
			} else if(arr.get(i) > auxList.get(auxList.size()-1)) {
				auxList.add(arr.remove(i));
			}
		}
		
		return merge(strandSort(arr), auxList);
	}
	
}
