package com.algorithms.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import sortAlgorithms.BubbleSort;
import sortAlgorithms.GnomeSort;
import sortAlgorithms.HeapSort;
import sortAlgorithms.InsertionSort;
import sortAlgorithms.MergeSort;
import sortAlgorithms.QuickSort;
import sortAlgorithms.SelectionSort;
import sortAlgorithms.ShakerSort;
import sortAlgorithms.ShellSort;


public class AppTest 
{

	List<Integer> list = Arrays.asList(5, 1, 4, 3, 2, 7, 0, 8, 9, 6);
	List<Integer> sortedList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
	ArrayList<Integer> unsortedArrayList = new ArrayList<>(list);
	ArrayList<Integer> sortedArrayList = new ArrayList<>(sortedList);
	
	
    @Test
    public void quickSort() {
        QuickSort sort = new QuickSort();
        Assert.assertEquals(sort.quickSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void mergeSort() {
    	MergeSort sort = new MergeSort();
        Assert.assertEquals(sort.mergeSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void insertionSort() {
    	InsertionSort sort = new InsertionSort();
        Assert.assertEquals(sort.insertionSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    @Ignore
    public void heapSort() {
    	HeapSort sort = new HeapSort();
    	Assert.assertEquals(sort.heapSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void bubbleSort() {
    	BubbleSort sort = new BubbleSort();
    	Assert.assertEquals(sort.bubbleSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void selectionSort() {
    	SelectionSort sort = new SelectionSort();
    	Assert.assertEquals(sort.selectionSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void shakerSort() {
    	ShakerSort sort = new ShakerSort();
    	Assert.assertEquals(sort.shakerSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void shellSort() {
    	ShellSort sort = new ShellSort();
    	Assert.assertEquals(sort.shellSort(unsortedArrayList), sortedArrayList);
    }
    
    @Test
    public void gnomeSort() {
    	GnomeSort sort = new GnomeSort();
    	Assert.assertEquals(sort.gnomeSort(unsortedArrayList), sortedArrayList);
    }
}
