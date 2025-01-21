package Basics;


import java.util.*;


class Node {
    int data;
    Node left;
    Node right;

    Node(int data ){
        this.data =data;
        left=null;
        right =null;
    }
}
public class create_tree {
    public Node root;


    // Inserting Level Wise Insertion
    public void insert(int data){
        Node newNode = new Node(data);
        Queue<Node> queue = new LinkedList<Node>();
        queue.offer(root);
        if (root==null){
            root =newNode;
            return;
        }
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            if (curr.left ==null){
                curr.left=newNode;
                return;
            }else {
                queue.offer(curr.left);
            }
            if (curr.right==null){
                curr.right=newNode;
                return;
            }else {
                queue.offer(curr.right);
            }
        }
    }

    // Binary Search Insertion
   public void BST_Insert(int val){
        root = insert(val,root);
   }
   private Node insert(int val, Node node){
        if (node==null){
            node = new Node(val);
            return node;
        }
       if (val<node.data){
           node.left=insert(val,node.left);
       }
        else if (val>node.data){
           node.right=insert(val,node.right);
       }else{
           node.right=insert(val,node.right);  // To handle Duplicate Values
       }
       return node;

   }
    public void populate(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            this.insert(arr[i]);
        }
    }


    public List<List<Integer>> bfsrep(){
        List<List<Integer>> results = new ArrayList<>();
        if (root==null){
            return results;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                Node curr =queue.poll();
                level.add(curr.data);
                if (curr.left!=null){
                    queue.offer(curr.left);
                } if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            results.add(level);
        }
        return results;
    }
    public void display(){
        display(root ,"Root Node :");
    }

    private void display(Node node, String details){
        if (node==null){
            return;
        }
        System.out.println(details+node.data);
        display(node.left,"Left Child of "+node.data+" : ");
        display(node.right,"Right Child of "+node.data+" : ");
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
        List<List<Integer>> rep = tree.bfsrep();
        System.out.println(rep);




    }
}
