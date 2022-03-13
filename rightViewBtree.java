// package com.company;

import java.util.ArrayList;
import java.util.List;

class Node{
    public int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
class Right {
    public int maxLevel = 0;
    void leftView(Node root, int level){
        if(root == null){
            return;
        }
        if(maxLevel < level){
            System.out.println(root.data + " ");
            maxLevel = level;
        }
        leftView(root.left, level + 1);

    }
    void rightView(Node root, int level, List<Integer> list){
        if (root == null){
            return;
        }

        if(maxLevel < level){
            System.out.println(root.data + " ");
            maxLevel = level;
        }
        rightView(root.right, level + 1, list);
    }
}
public class Main {

    public static void main(String[] args) {
        int maxNumber;
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(6);
        Right tree = new Right();
        tree.maxLevel = 0;
        tree.leftView(root.left, 1);
        tree.maxLevel = 0;
        List<Integer> list = null;
        tree.rightView(root, 1, list);
        list = new ArrayList<>();
        tree.rightView(root, 1, list);

    }
}
