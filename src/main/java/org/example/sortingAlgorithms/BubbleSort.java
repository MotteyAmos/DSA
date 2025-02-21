package org.example.sortingAlgorithms;

public class BubbleSort {
    int[] nums;

    public BubbleSort(int[] nums){
        this.nums = nums;

    }

    public int[] sort(){
        for (int i=nums.length -1; i>0; i--){
            for (int j=0; j < i; j++){

                if (nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }

        }
        return nums;
    }

}
