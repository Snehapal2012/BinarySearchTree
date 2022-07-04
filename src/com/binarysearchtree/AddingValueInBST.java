package com.binarysearchtree;

public class AddingValueInBST {
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
        System.out.println("Values of Left , Root and Right nodes are--------------->");
        AddingValueInBST bst = new AddingValueInBST();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56); // 56 is value is adding in root
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);// 30->56->70->80
        bst.print(root);
    }
}
