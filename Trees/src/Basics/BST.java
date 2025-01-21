package Basics;

public class BST {
    public Node root;
    public BST(){}
    public class Node{
         int value;
        public Node left;
        public Node right;
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
    // For Sorted Array like---> {1,2,3,4,5,6,7,8,9,10}
    public void populatesorted(int[] arr,int start,int end){
        if (start>=end){ return;}
        int mid = (start+end)/2;
        this.insert(arr[mid]);
         populatesorted(arr,start,mid);
         populatesorted(arr,mid+1,end);
    }

    public void display(){
        display(root ,"Root Node :");
    }

    private void display(Node node,String details){
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

    private boolean balanced(Node node){  //  height <=1
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


        BST tree2 = new BST();
        int[] arr2 ={1,2,3,4,5,6,7,8,9};
        tree2.populatesorted(arr2,0, arr2.length);
        tree2.display();



            /*
                        tree                                                      tree2
                  ------- 5-----                                               -----5------
                  |             |                                              |          |
              ----2---          7---                                       ----3----   ----8----
              |       |            |                                       |        |  |        |
              1     --4          ----9-----                             ---2---  ---4 -7--   ---9---
                    |            |         |                            |      | |   |  |  |     |
                    3            8         10                           1               6

             */
    }
}
