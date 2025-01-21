package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        left=right=null;
    }
}
public class Traversals {
    Node root;
    public static List<Integer> Preorder_Traversal(Node node){
        List<Integer> list = new ArrayList<>();
        if (node==null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (!stack.isEmpty()){
            Node current = stack.pop();
            list.add(current.data);

            if (current.right!=null){
                stack.push(current.right);
            }
            if (current.left!=null){
                stack.push(current.left);
            }
        }
        return list;
    }

    public static List<Integer> Inorder_Traversal(Node node){
        List<Integer> list = new ArrayList<>();
        if (node==null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        Node current = node;
        while (!stack.isEmpty() || current!=null ){

            while (current!=null){
                stack.push(current);
                current=current.left;
            }

            current=stack.pop();
            list.add(current.data);
            current=current.right;
        }
        return list;
    }
    public static List<Integer> Postorder_Traversal(Node node){
        List<Integer> list = new ArrayList<>();
        if (node==null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        Node current = node;
        stack.push(current);
        while (!stack.isEmpty()){
            current=stack.pop();
            list.add(0, current.data);

            if (current.left!=null){
                stack.push(current.left);
            } if (current.right!=null){
                stack.push(current.right);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        Traversals tree = new Traversals();
        tree.root =new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);

        List<Integer> result1 =Preorder_Traversal(tree.root);
        System.out.println("PREORDER TRAVERSAL-->"+result1);

        List<Integer> result2 =Inorder_Traversal(tree.root);
        System.out.println("INORDER TRAVERSAL-->"+result2);

        List<Integer> result3 = Postorder_Traversal(tree.root);
        System.out.println("POSTORDER TRAVERSAL-->"+result3);


    }
}
