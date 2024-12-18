package Basics;

import java.util.Scanner;


public class BinaryTree {
    private Node root;
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val){
            this.val =val;
        }
    }
    public void populate(Scanner sc){
        System.out.println("Enter the value of Root Node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }
    private void populate(Scanner sc ,Node node){
        System.out.printf("Insert at Left of %d : ",node.val);
        boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter the Value for left: ");
            int value = sc.nextInt();
            Node leftnode = new Node(value);
            node.left=leftnode;
            populate(sc,leftnode);
        }
        System.out.printf("Insert at Right of %d : ",node.val);
        boolean right = sc.nextBoolean();
        if (right){
            System.out.println("Enter the Value for Right :");
            int value = sc.nextInt();
            Node rightnode = new Node(value);
            node.right=rightnode;
            populate(sc,rightnode);
        }

    }
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.val);
        } else {
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    // Traversals
    public void Pre_order(){
        Pre_order(root);
    }
    public void Pre_order(Node node){
        if (node==null){
            return;
        }
        System.out.println(node.val+"-->");
        Pre_order(node.left);
        Pre_order(node.right);
    }

    public void In_order(){
        In_order(root);
    }
    public void In_order(Node node){
        if (node==null){
            return;
        }
        In_order(node.left);
        System.out.println(node.val+"-->");
        In_order(node.right);
    }
    public void Post_order(){
        Post_order(root);
    }
    public void Post_order(Node node){
        if (node==null){
            return;
        }
        Post_order(node.left);
        Post_order(node.right);
        System.out.println(node.val+"-->");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       BinaryTree tree = new BinaryTree();
       tree.populate(sc);
       tree.prettyDisplay();
    }
}
