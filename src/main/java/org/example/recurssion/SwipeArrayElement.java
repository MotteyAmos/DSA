package org.example.recurssion;

import java.util.Arrays;

public class SwipeArrayElement {


    public void swipe(int[] nums,int i, int j){
        if (j <=i){
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        swipe(nums, i+1, j-1);
    }

    public void run(int[] nums){
        swipe(nums, 0,nums.length -1);
        Arrays.stream(nums).forEach(num->System.out.print(num));
    }


}
