package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PostOrder_Traversal {
    public static void Postorder_Traversal(Node node){
        if (node==null){
            return;
        }
        Postorder_Traversal(node.left);
        Postorder_Traversal(node.right);
        System.out.println(node.data+" ");

    }
    public static List<Integer> Postorder_Traversal_2(Node node){
        List<Integer> list = new ArrayList<>();
        if (node==null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while(!stack.isEmpty()){
            Node current = stack.pop();
            list.add( 0,current.data);

            if (current.left !=null){
                stack.push(current.left);
            }
            if (current.right !=null){
                stack.push(current.right);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        // Example 1
        create_tree tree = new create_tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        Postorder_Traversal(tree.root);
        List<Integer> result = Postorder_Traversal_2(tree.root);
        System.out.println(result);

        // Example 2
        create_tree tree2 = new create_tree();
        tree2.root = new Node(1);
        tree2.root.left= new Node(2);
        tree2.root.right= new Node(3);
        tree2.root.left.left = new Node(4);
        tree2.root.left.right = new Node(5);
        tree2.root.left.left.left = new Node(6);
        tree2.root.left.left.right = new Node(7);
        tree2.root.left.left.left.left = new Node(8);
        tree2.root.left.left.left.right = new Node(9);
         Postorder_Traversal(tree2.root);


    }
}
