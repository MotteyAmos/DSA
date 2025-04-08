package org.example.recurssion;

public class Palindrome {

    private boolean check(String word, int i, int j){
        if (j <= i){
            return true;
        }

        if (word.charAt(i) != word.charAt(j)){
            return false;
        }

        return check(word, i +1, j-1);
    }

    public boolean run(String word){
        return check(word.toLowerCase(),0, word.length()-1);
    }
}
