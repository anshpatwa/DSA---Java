package Basics;

public class BST {
    private Node root;
    public BST(){}
    public class Node{
        private int value;
        private Node left;
        private Node right;
        private int height;
        public Node(int value){
            this.value = value;
        }
        public int getvalue(){
            return value;
        }
    }

    public void insert(int val){
       root = insert(val,root);
    }

    private Node insert(int val,Node node){
        if (node==null){
            node = new Node(val);
            return node;
        }
        if (val<node.value){
            node.left=insert(val,node.left);
        }
        if (val>node.value){
            node.right=insert(val,node.right);
        }
        node.height =Math.max(height(node.left),height(node.right)+1);
        return node;
    }

    public int height(Node node){
        if (node == null){
            return -1;
        }
        return node.height;
    }


    public boolean isempty(){
        return root==null;
    }

    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }

    public void display(){
        display(root ,"Root Node :");
    }

    public void display(Node node,String details){
        if (node==null){
            return;
        }
        System.out.println(details+node.value);
        display(node.left,"Left Child of "+node.value+" : ");
        display(node.right,"Right Child of "+node.value+" : ");
    }

    public boolean balanced(){
        return balanced(root);
    }

    public boolean balanced(Node node){  //  height <=1
        if (node==null){
            return true;
        }
        return Math.abs(height(node.left)-height(node.right))<=1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        BST tree = new BST();
        int[] arr = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
        tree.populate(arr);
        tree.display();
        System.out.println("Balanced: "+tree.balanced());
            /*

                  ------- 5-----
                  |             |
              ----2---          7---
              |       |            |
              1     --4          ----9-----
                    |            |         |
                    3            8         10

             */
    }
}
