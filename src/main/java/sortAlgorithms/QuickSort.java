package sortAlgorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
	
	private List<Integer> mergeLists(List<Integer> arr1, int pivot, List<Integer> arr2) {
		ArrayList<Integer> list = new ArrayList<>();

		list.addAll(quickSort(arr1));
		list.add(pivot);
		list.addAll(quickSort(arr2));
		
		return list;
	}

	public List<Integer> quickSort(List<Integer> arr) {
		if(arr.size() <= 1) { return arr; }
		
		int pivot = arr.get(0);
		ArrayList<Integer> left = new ArrayList<>();
		ArrayList<Integer> right = new ArrayList<>();
		
		for(int i=1; i<arr.size(); i++) {
			if(arr.get(i) < pivot) {
				left.add(arr.get(i));
			} else if(arr.get(i) > pivot) {
				right.add(arr.get(i));
			}
		}

		return mergeLists(left, pivot, right);
	}
	
}
