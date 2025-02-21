package org.example.sortingAlgorithms;

public class InsertionSort {
    int[] nums;

    public InsertionSort(int[] nums){
        this.nums = nums;
    }

    public int[] sort(){

        for (int i=1; i<nums.length; i++){
            int temp = this.nums[i];
            int temIdx = i;

            for (int j=i -1; j>=0; j--){
                if (nums[j] > temp){
                    nums[temIdx] = nums[j];
                    nums[j] = temp;
                    temIdx -=1;
                }else{

                    break;
                }
            }

        }
        return nums;
    }
}
