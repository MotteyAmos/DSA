package org.example.treeDSA;

public class Inorder<T> {

    public Node<T> root;


    public Node traverseLeft(Node node){
        if (node.left == null){
            return node;
        }
        return traverseLeft(node.left);
    }

    public Node traverseRight(Node node){
        if (node.right == null){
            return node;
        }
        return traverseRight(node.right);
    }
}
