package org.example.sortingAlgorithms;

import java.util.Arrays;

public class HeepSort {
    int[] nums;
    int[] heapArray;

    public HeepSort(int[] nums){
        this.nums = nums;
        this.heapArray =  new int[nums.length];
        heap();
    }

    public void swapHeap(int idx1, int idx2){
        // use when creating a heap tree
        int temp = this.nums[idx1];
        this.nums[idx1] = this.nums[idx2];
        this.nums[idx2] = temp;
    }
    public void heap(){

        for (int i= 1;i<this.nums.length; i++ ){

            int p = i;

            while (p > 0){
                int parentIdx = (p +1) /2;
                System.out.println(parentIdx + " " + i );

                p = parentIdx -1;

                if (parentIdx != 1){
                    parentIdx +=1;
                }
                if (this.nums[p] < this.nums[parentIdx]){
                    swapHeap(p, parentIdx);
                }
            }


        }
        System.out.println("");
        Arrays.stream(nums).forEach(num ->System.out.print(num));
    }
}
