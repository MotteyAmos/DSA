package org.example.sortingAlgorithms;

public class SelectionSort {
    int[] nums;

    public SelectionSort(int[] nums){
        this.nums = nums;
    }

    public int[] sort(){
        for (int i=0; i<nums.length; i++){
            int min = nums[i];
            int tempIndx = i;

            for (int j=i+1; j<nums.length;j++){
                if (nums[j] < min){
                    min = nums[j];
                    tempIndx = j;

                }
            }
            nums[tempIndx] = nums[i];
            nums[i] = min;
        }

        return nums;
    }
}
