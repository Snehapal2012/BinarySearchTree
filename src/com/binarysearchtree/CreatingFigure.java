package com.binarysearchtree;

public class CreatingFigure {
    // BST node
    static class Node {
        int key;
        Node left, right;
    };
    // Utility function to create a new node
    static Node newNode(int data)
    {
        Node temp = new Node();

        temp.key = data;

        temp.left = null;
        temp.right = null;

        return temp;
    }
    public Node insert(Node root, int val) {

        if (root == null) {
            return createNewNode(val);
        }
        if (val < root.key) {
            root.left = insert(root.left, val);

        } else if (val > root.key) {
            root.right = insert(root.right, val);
        }
        return root;

    }
    //method name as createNewNode
    public Node createNewNode(int k) {
        Node bst = new Node();
        bst.key = k;
        bst.left = null;
        bst.right = null;
        return bst;
    }
    // create a method name as print , they are printing data
    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.println(root.key);
        //null right side
        print(root.right);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Binary tree search program");
        CreatingFigure bst = new CreatingFigure();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56); // 56 is value is adding in root
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);// 30->56->70->80
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);
        bst.print(root);
    }
}
