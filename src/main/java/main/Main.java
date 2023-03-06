package main;

import java.util.Arrays;
import java.util.List;

import algorithms.MergeSort;
import algorithms.QuickSort;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 6, 1, 7, 2);
		
		QuickSort quickSort = new QuickSort();
		MergeSort mergeSort = new MergeSort();
		System.out.println(mergeSort.mergeSort(list));
		
	}
	
}
