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
        HeepSort heepSort = new HeepSort(n);
        Hippify hippify = new Hippify(n);
        Hippify hippify1 = new Hippify(n);
//        int[] j = new int[5];
//        System.out.println(j[1]);
        Arrays.stream(hippify1.sort()).forEach(num-> System.out.print(num));

    }
}