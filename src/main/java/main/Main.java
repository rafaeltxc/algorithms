package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import sortAlgorithms.BogoSort;
import sortAlgorithms.BubbleSort;
import sortAlgorithms.CombSort;
import sortAlgorithms.GnomeSort;
import sortAlgorithms.HeapSort;
import sortAlgorithms.InsertionSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.QuickSort;
import sortAlgorithms.SelectionSort;
import sortAlgorithms.ShakerSort;
import sortAlgorithms.ShellSort;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5, 1, 7, 4, 9, 8, 3, 2, 6);
		ArrayList<Integer> arrayList = new ArrayList<>(list);
		
		BubbleSort bubbleSort = new BubbleSort();
		QuickSort quickSort = new QuickSort();
		MergeSort mergeSort = new MergeSort();
		InsertionSort insertionSort = new InsertionSort(); 
		HeapSort heapSort = new HeapSort();
		SelectionSort selectionSort = new SelectionSort();
		ShakerSort shakerSort = new ShakerSort();
		ShellSort shellShort = new ShellSort();
		GnomeSort gnomeSort = new GnomeSort();
		CombSort combSort = new CombSort();
		BogoSort bogoSort = new BogoSort();
		System.out.println(combSort.combSort(arrayList));
	}
	
}
