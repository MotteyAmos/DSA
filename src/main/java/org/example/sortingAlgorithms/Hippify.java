package org.example.sortingAlgorithms;

public class Hippify {
    int[] nums;

    public Hippify(int[] nums){
        this.nums = nums;
    }

    public void swap(int idx1, int idx2, int[] swapArray){
        int temp = swapArray[idx1];
        swapArray[idx1] = swapArray[idx2];
        swapArray[idx2] = temp;
    }

    public void hippify(){

        if (this.nums.length > 2){
            for (int i=(this.nums.length/2); i>1; i--){
                int leftChild = 2*i;
                int rightChild = (2*i) +1;

                if (this.nums[leftChild-1] > this.nums[rightChild-1]){
                    if (this.nums[leftChild-1] > this.nums[i-1]);{
                        swap(leftChild-1,i-1,this.nums);
                    }
                }else{
                    if (this.nums[rightChild-1] > this.nums[i-1]);{
                        swap(rightChild-1,i-1,this.nums);
                    }
                }
            }
        }
    }
}
