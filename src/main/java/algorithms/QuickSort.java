package algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

	public List<Integer> quickSort(List<Integer> arr) {
		if(arr.size() <= 1) {
			return arr;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
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
		
		list.addAll(quickSort(left));
		list.add(pivot);
		list.addAll(quickSort(right));
		
		return list;
	}
	
}
