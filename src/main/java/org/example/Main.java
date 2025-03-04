package org.example;

import org.example.sortingAlgorithms.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] n = {2,7,4,1,5,3};
        BubbleSort sortVal = new BubbleSort(n);
        InsertionSort inserVal = new InsertionSort(n);
        SelectionSort selectionSort = new SelectionSort(n);
        MergeSort mergeSort = new MergeSort(n);
        QuickSort quickSort = new QuickSort(n);


        Arrays.stream(quickSort.sort()).forEach(num-> System.out.print(num));

    }
}