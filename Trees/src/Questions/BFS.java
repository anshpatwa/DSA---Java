package Questions;
import java.util.*;
// Breadth First Search -graph traversal algorithm -Visting nodes of Every Level


public class BFS {
    static class Node {
        Node root;
        int data;
        Node left, right;
        public Node(int item) {
            data = item;
            left = null;
            right = null;
        }
    }
    //Method 1 --> Naive Approach --> finding the height of the tree and traversing each level and printing the nodes of that level-->O(n^2)
    // Method 2 --> Using Queue -->O(N)
    public static  List<List<Integer>> bfstraversal(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root ==null){
            return result;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                Node curr = queue.poll();
                currentlevel.add(curr.data);
                if (curr.left!=null){
                    queue.offer(curr.left);
                }if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            result.add(currentlevel);
        }
            return result;
    }


    // Average of Levels in Binary Tree
    public static  List<Double> avgoflevels(Node root){
        List<Double> result = new ArrayList<>();
        if(root ==null){
            return result;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            double averagelevel = 0;
            for (int i = 0; i < levelsize; i++) {
                Node curr = queue.poll();
                averagelevel +=curr.data;
                if (curr.left!=null){
                    queue.offer(curr.left);
                }if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            averagelevel = averagelevel/levelsize;
            result.add(averagelevel);
        }
        return result;
    }

    // Finding the Next Successor according to the levels
    public static Node nextsuccessor(Node root,int key){
        List<Double> result = new ArrayList<>();
        if(root ==null){
            return null;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();

                Node curr = queue.poll();
                if (curr.left!=null){
                    queue.offer(curr.left);
                }if (curr.right!=null){
                    queue.offer(curr.right);
                }
                if (curr.data == key){
                    break;
                }
        }
        return queue.peek();
    }

    // Traversing the Tree in ZigZag Manner
    public static List<List<Integer>> zigzag(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root ==null){
            return result;
        }
        Deque<Node> deque = new LinkedList();
        boolean reverse =false;
        deque.add(root);

        while(!deque.isEmpty()){
            int levelsize = deque.size();

            List<Integer> currentlevel = new ArrayList<>(levelsize);

            for (int i = 0; i < levelsize; i++) {
               if (!reverse){
                   Node curr = deque.pollFirst();
                   currentlevel.add(curr.data);
                   if (curr.left!=null){
                       deque.addLast(curr.left);
                   }if (curr.right!=null){
                       deque.addLast(curr.right);
                   }
               }
               else{
                   Node curr = deque.pollLast();
                   currentlevel.add(curr.data);
                   if (curr.right!=null){
                       deque.addFirst(curr.right);
                   }if (curr.left!=null){
                       deque.addFirst(curr.left);
                   }
               }
            }

            reverse = !reverse;
            result.add(currentlevel);
        }
        return result;
    }
    // Levels In Reverse Order
    public static  List<List<Integer>> levelOrderBottom(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root ==null){
            return result;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while(!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentlevel = new ArrayList<>(levelsize);
            for (int i = 0; i < levelsize; i++) {
                Node curr = queue.poll();
                currentlevel.add(curr.data);
                if (curr.left!=null){
                    queue.offer(curr.left);
                }if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            result.add(0,currentlevel);
        }
        return result;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // BFS Basics
        List<List<Integer>> result = bfstraversal(root);
        for (List<Integer> list : result) {
            System.out.print(list + ",");
        }
        //System.out.println(Arrays.toString(new List[]{result}));

        //Average Of Every Level in a Single Array
        List<Double> avg = avgoflevels(root);
        System.out.println();
        System.out.println(Arrays.toString(new List[]{avg}));

        // Next Successor
        Node exp = nextsuccessor(root,3);
        System.out.println(exp.data);

        // Zig-Zag
        List<List<Integer>> zigzag = zigzag(root);
        System.out.println(Arrays.toString(new List[]{zigzag}));

        // Levels in Reverse Order
        List<List<Integer>> reverselevels = levelOrderBottom(root);
        System.out.println(Arrays.toString(new List[]{reverselevels}));
    }

}



/*
BFS -----> https://leetcode.com/problems/binary-tree-level-order-traversal/description/
AVGLVL -----> https://leetcode.com/problems/binary-tree-level-order-traversal/description/
Zig-Zag ----> https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/1475574638/
*/