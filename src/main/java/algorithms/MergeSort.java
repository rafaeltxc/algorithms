package algorithms;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

	public List<Integer> merge(List<Integer> arr1, List<Integer> arr2) {
		ArrayList<Integer> mergedArr = new ArrayList<>();
		while(arr1.size() > 0 && arr2.size() > 0) {
			if(arr1.get(0) < arr2.get(0)) {
				mergedArr.add(arr1.get(0));
				arr1.remove(0);
			} else {
				mergedArr.add(arr2.get(0));
				arr2.remove(0);
			}
		}
		
		while(arr1.size() > 0) {
			mergedArr.add(arr1.get(0));
			arr1.remove(0);
		}
		
		while(arr2.size() > 0) {
			mergedArr.add(arr2.get(0));
			arr2.remove(0);
		}
		
		return mergedArr;
	}
	
	public List<Integer> mergeSort(List<Integer> arr) {
		if(arr.size() <= 1) {
			return arr;
		}
		
		List<Integer> arr1 = new ArrayList<>(arr.subList(0, (int) (Math.floor(arr.size())/2)));
		List<Integer> arr2 = new ArrayList<>(arr.subList((int) Math.floor((arr.size())/2), arr.size()));
		
		List<Integer> sortedArr1 = mergeSort(arr1);
		List<Integer> sortedArr2 = mergeSort(arr2);

		return merge(sortedArr1, sortedArr2);
	}
	
}
