package org.example.sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
    int[] nums;
    public QuickSort(int[] nums){
        this.nums = nums;
    }

    public int[] sort(){

       quickSort(0, nums.length-1);

        return nums;


    }
    public void quickSort(int rightIdx, int leftIdx){

        if (leftIdx <= rightIdx) return;
        int pivot = partition(rightIdx, leftIdx);

        quickSort(rightIdx, pivot-1);
        quickSort(pivot +1, leftIdx);

    }

    public int partition(int startIdx, int endIdx){

        int i = startIdx -1;
        int j = startIdx;
        int pivort = endIdx;

        while (j < pivort){
            if (nums[j] < nums[pivort]){
                i+=1;

                int temp = nums[i];
                nums[i] = nums[j];

                nums[j] = temp;

            }
            j +=1;
        }

        int temp = nums[i+1];
        nums[i+1] = nums[pivort];
        nums[pivort] = temp;

        return i+1;

    }
}
