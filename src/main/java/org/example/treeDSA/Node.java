package org.example.treeDSA;

public class Node<T> {

    public T data;
    public Node<T> left;
    public Node<T> right;

    public Node(T data, Node<T> left, Node<T> right){
        this.left = left;
        this.right = right;
        this.data = data;
    }

    public T getValue(){
        return data;
    }
    public void setValue(T data){
        this.data = data;
    }

    public boolean hasLeftChild(){
        if (left == null){
            return false;
        }else{
            return true;
        }
    }
    public boolean hasRightChild(){
        if (right == null){
            return false;
        }else{
            return true;
        }
    }
}
