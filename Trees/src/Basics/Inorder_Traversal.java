package Basics;
import java.util.*;

public class Inorder_Traversal {
    //      Inorder Traversals
    public static void Inorder_Traversal(Node node){
        if (node==null){
            return;
        }
       Inorder_Traversal(node.left);
        System.out.print(node.data+" ");
        Inorder_Traversal(node.right);
    }

    // Method 2
    public static List<Integer> Inorder_Traversal_2(Node node){
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Node current = node;

        while (current !=null || !stack.isEmpty()){
            while (current !=null){
                stack.push(current);
                current=current.left;
            }
            current=stack.pop();
            list.add(current.data);
            current=current.right;
        }
        return list;
    }


    public static void main(String[] args) {

        // Tree2 Is creates using BFS insertion i.e. every level is getting filled
        create_tree tree2 = new create_tree();
        tree2.insert(1);
        tree2.insert(2);
        tree2.insert(3);
        tree2.insert(4);
        tree2.insert(5);
        tree2.insert(6);
        tree2.insert(7);
        List<List<Integer>> rep2 = tree2.bfsrep();
        System.out.println(rep2);

        Inorder_Traversal(tree2.root);
        List<Integer> result =Inorder_Traversal_2(tree2.root);
        System.out.println(result);

        // Tree 3 is Binary Search Tree
       create_tree tree3 = new create_tree();
       // Binary tree of { 7, 5, 1, 8, 3, 6, 0, 9, 4, 2 }
        tree3.root= new Node(7);
        tree3.root.left =new Node(5);
        tree3.root.right=new Node(8);
        tree3.root.right.right=new Node(9);
        tree3.root.left.left=new Node(1);
        tree3.root.left.right=new Node(6);
        tree3.root.left.left.left=new Node(0);
        tree3.root.left.left.right=new Node(3);
        tree3.root.left.left.right.left=new Node(2);
        tree3.root.left.left.right.right=new Node(4);
        Inorder_Traversal(tree3.root);

    }
}
