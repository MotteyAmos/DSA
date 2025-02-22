package org.example;

import org.example.sortingAlgorithms.BubbleSort;
import org.example.sortingAlgorithms.InsertionSort;
import org.example.sortingAlgorithms.MergeSort;
import org.example.sortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] n = {2,7,4,1,5,3};
        BubbleSort sortVal = new BubbleSort(n);
        InsertionSort inserVal = new InsertionSort(n);
        SelectionSort selectionSort = new SelectionSort(n);
        MergeSort mergeSort = new MergeSort(n);

        Arrays.stream(mergeSort.sort()).forEach(num-> System.out.print(num));

    }
}