package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrder_Traversal {
    public static void PreOrder_Traversal(Node node){
        if (node==null){
            return;
        }
        System.out.print(node.data+" ");
        PreOrder_Traversal(node.left);
        PreOrder_Traversal(node.right);
    }
    public static List<Integer> PreOrder_Traversal_2(Node node){
        List<Integer> list = new ArrayList<>();
        if (node == null){
            return list;
        }

        Stack<Node> stack = new Stack<>();
        Node current = node;
        stack.push(current);

        while(!stack.isEmpty()){
            current =stack.pop();
            list.add(current.data);


            if (current.right!=null){
              stack.push(current.right) ;
            }
            if (current.left!=null){
                stack.push(current.left);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        create_tree tree = new create_tree();
        tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        PreOrder_Traversal(tree.root);
        List<Integer> result =PreOrder_Traversal_2(tree.root);
        System.out.println(result);
    }
}
