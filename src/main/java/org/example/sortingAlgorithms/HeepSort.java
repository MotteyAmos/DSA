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
        int temp = heapArray[idx1];
        heapArray[idx1] = this.nums[idx2];
        heapArray[idx2] = temp;
    }
    public void heap(){

        for (int i= 0;i<this.nums.length; i++ ){
            if (i==0){
                heapArray[0] = this.nums[0];
            }
            else{
                int p = i;

                while (p > 0){
                    int parentIdx = (p +1) /2;
                    if (parentIdx < 0) {
                        break;
                    }
                    p = parentIdx -1;

                    if (heapArray[parentIdx-1] < nums[i]){
                        swapHeap(parentIdx-1, i);
                    }else{
                        heapArray[i] = nums[i];
                    }
                }
            }

        }
        System.out.println("");
        Arrays.stream(heapArray).forEach(num ->System.out.print(num));
    }
}
