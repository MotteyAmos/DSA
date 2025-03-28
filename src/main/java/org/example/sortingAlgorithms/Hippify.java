package org.example.sortingAlgorithms;

import java.util.Arrays;

public class Hippify {
    int[] nums;

    public Hippify(int[] nums){
        this.nums = nums;
    }

    public void swap(int idx1, int idx2){
        int temp = this.nums[idx1];
        this.nums[idx1] = this.nums[idx2];
        this.nums[idx2] = temp;
    }

    public void maxHeepHelper(int i, int endAt){
        int y = 2*i;
        while (y <= endAt){
            int leftChild2 = 2*y;
            int rightChild2 = (2*y) +1;
            if (rightChild2 <= endAt && this.nums[rightChild2-1] > this.nums[leftChild2-1]){
                if (this.nums[rightChild2-1] > this.nums[y-1]){

                    swap(rightChild2-1,y-1);

                }
            }else if (leftChild2 <= endAt){
                if (this.nums[leftChild2-1] > this.nums[y-1]) {
                    swap(leftChild2 - 1, y - 1);
                }
            }
            y *=2;
        }
    }

    public void hippify(int endAt){
        if (endAt > 2){
            for (int i=(endAt/2); i>=1; i--){
                int leftChild = 2*i;
                int rightChild = (2*i) +1;

                if (rightChild <= endAt && this.nums[rightChild-1] > this.nums[leftChild-1]){
                    if (this.nums[rightChild-1] > this.nums[i-1]){
                        swap(rightChild-1,i-1);
                        maxHeepHelper(i,endAt);
                    }
                }else{
                    if (this.nums[leftChild-1] > this.nums[i-1]){
                        swap(leftChild-1,i-1);
                        maxHeepHelper(i,endAt);
                    }
                }
            }
        }else{
            if (this.nums[0] < this.nums[1]){
                swap(0,1);
            }
        }
    }

    public int[] sort(){

        for (int i=this.nums.length; i>1;i--){
            hippify(i);
            swap(0,i-1);
        }

        return this.nums;
    }
}
