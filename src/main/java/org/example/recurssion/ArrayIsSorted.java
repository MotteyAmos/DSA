package org.example.recurssion;

public class ArrayIsSorted {

    public boolean isSorted(int index, int[] subArray){

        if (index >= subArray.length -1){
            return true;
        }
        return subArray[index] < subArray[index + 1] && isSorted(index+1, subArray);
    }
}
