package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 6, 1, 7, 2, 9);
		ArrayList<Integer> arrayList = new ArrayList<>(list);
		
		QuickSort quickSort = new QuickSort();
		MergeSort mergeSort = new MergeSort();
		InsertionSort insertionSort = new InsertionSort(); 
		System.out.println(insertionSort.insertionSort(arrayList));
		
	}
	
}
