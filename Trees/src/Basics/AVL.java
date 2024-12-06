package Basics;
//https://www.javatpoint.com/avl-tree
public class AVL {
    private Node root;
    public AVL(){}
    public class Node{
        private final int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value){this.value=value;}

        public int getValue(){return value;}
    }
    public int height(){return height(root);}

    private int height(Node node){ return  (node==null)? -1 : node.height;}

    public void insert(int value){
        root = insert(value,root);
    }

    private Node insert(int value,Node node){
        if (node==null){
           node = new Node(value);
           return node;
        }
        if (value< node.value){
            node.left =insert(value,node.left);
        }
        if (value> node.value){
            node.right =insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;

        return rotate(node);
    }

    private Node rotate(Node node){
        if (height(node.left)-height(node.right)>1){
        // left heavy
            if (height(node.left.left)-height(node.left.right)>0){
                //left left case i.e Right Rotate (P)
                return rightrotate(node);
            }
            if (height(node.left.left)-height(node.left.right)<0){
                //left right case --> 1. Left Rotate (C)  --> 2. Right Rotate (P)
                node.left=leftrotate(node.left);
                return rightrotate(node);
            }
        }

        if (height(node.left)-height(node.right)<-1){
            // right heavy
            if (height(node.right.left)-height(node.right.right)<0){
                //right right case
                return leftrotate(node);
            }
            if (height(node.right.left)-height(node.right.right)>0){
                // Right Left Case --> 1. Right Rotate (C)  --> 2. Left Rotate (P)
                node.right=rightrotate(node.right);
                return leftrotate(node);
            }
        }
        return node;
    }

    public Node rightrotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(height(p.left),height(p.right)+1);
        c.height=Math.max(height(c.left),height(c.right)+1);

        return c;
    }

    public Node leftrotate(Node c){
        Node g = c.right;
        Node t = g.left;

        g.left=c;
        c.right=t;

        g.height =Math.max(height(g.left),height(g.right)+1);
        c.height =Math.max(height(c.left),height(c.right)+1);

        return g;
    }


    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }
        System.out.println(details + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
    }

    public static void main(String[] args) {
        AVL tree = new AVL();
        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.height()); // log(1000) =3
        System.out.println(tree.balanced());
    }
}
