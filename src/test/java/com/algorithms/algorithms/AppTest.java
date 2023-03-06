package com.algorithms.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import algorithms.HeapSort;
import algorithms.InsertionSort;
import algorithms.MergeSort;
import algorithms.QuickSort;

public class AppTest 
{

	List<Integer> list = Arrays.asList(5, 1, 4, 2, 3);
	List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
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
}
