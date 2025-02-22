package org.example.sortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    int[] nums;
    public MergeSort(int[] nums){
        this.nums = nums;
    }

    public int[] sort(){
        divide(nums, 0,nums.length-1);
        return this.nums;
    }

    public void divide(int[] arr, int start, int end){

        if (start >= end) return;
            int mid=(start + end)/2;

            divide(arr, start, mid);
            divide(arr, mid+1, end);

            merge(arr, start,end, mid);

    }

    public void merge(int[] arr, int start, int end, int mid){
        int[] lArray = Arrays.copyOfRange(arr, mid+1, end+1) ;
        int[] rArray = Arrays.copyOfRange(arr, start, mid+1);
//        Arrays.stream(lArray).forEach(n->System.out.print(n));
//        System.out.println("");
//        Arrays.stream(rArray).forEach(n->System.out.print(n));

        int rIdx = 0;
        int lIdx = 0;
        int idxPos = start;

        while (rIdx < rArray.length && lIdx < lArray.length){
            if (lArray[lIdx] < rArray[rIdx]){
                this.nums[idxPos] = lArray[lIdx];
                lIdx +=1;

            }
            else{
                this.nums[idxPos] = rArray[rIdx];
                rIdx +=1;
            }
            idxPos +=1;
        }

       while (rIdx < rArray.length){
           this.nums[idxPos] = rArray[rIdx];
           rIdx +=1;
       }
        while (lIdx< lArray.length){
            this.nums[idxPos] = lArray[lIdx];
            lIdx +=1;
        }
    }
}
