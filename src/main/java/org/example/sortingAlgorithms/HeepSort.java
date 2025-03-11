package org.example.sortingAlgorithms;

import java.util.Arrays;

public class HeepSort {
    int[] nums;


    public HeepSort(int[] nums){
        this.nums = nums;
        heap(this.nums, this.nums.length);
        sort();
    }

    public void swapHeap(int idx1, int idx2, int[] swapArray){
        int temp = swapArray[idx1];
        swapArray[idx1] = swapArray[idx2];
        swapArray[idx2] = temp;
    }
    public void heap(int[] heapNums, int endAt){
        for (int i= 2;i<=endAt; i++ ){

            int parentIdx = i;
            int childIdx =i;

            while (parentIdx > 1){
                parentIdx = parentIdx /2;

                if (heapNums[childIdx-1] > heapNums[parentIdx-1]){
                    swapHeap(childIdx-1, parentIdx-1, heapNums);
                    childIdx = parentIdx;
                }
            }
        }
    }

    public void sort(){
        for (int i=this.nums.length-1; i>0;i--){
            swapHeap(0,i,this.nums);
            heap(this.nums, i);


        }
    }
}
