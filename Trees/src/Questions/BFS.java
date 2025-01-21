package Questions;

import java.util.*;
// Breadth First Search -graph traversal algorithm -Visting nodes of Every Level


public class BFS {
     public static Node root;

    static class Node{
        int val;
        Node left;
        Node right;
        Node next;
        int height;

        public Node(int value){
            this.val = value;
            this.next=null;
        }
    }
        // BFS Representation
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
                level.add(curr.val);
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

    // BFS in Reverse order
    public List<List<Integer>> bfsrev(){
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
                level.add(curr.val);
                if (curr.left!=null){
                    queue.offer(curr.left);
                } if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }
            results.add(0,level);
        }
        return results;
    }

    // Insert Level Wise in a tree(BFS Insert)
    public void bfsInsert(int value){
        Node newNode = new Node(value);
        if (root==null){
            root=newNode;
            return;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node curr = queue.poll();
            if (curr.left==null){
                curr.left = newNode;
                return;
            }else {
                queue.offer(curr.left);
            }
            if (curr.right==null){
                curr.right = newNode;
                return;
            }else {
                queue.offer(curr.right);
            }
        }
    }

    // Average of Every Level of Tree
    public List<List<Double>> avglvl(){

        List<List<Double>> results = new ArrayList<>();
        if (root == null){ return results;}

        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while(!queue.isEmpty()){
            int queuesize = queue.size();

            List<Double> level = new ArrayList<>(queuesize);
            double averagelvl = 0;

            for (int i = 0; i < queuesize; i++) {
                Node curr = queue.poll();
                averagelvl += curr.val;
                if (curr.left!=null){
                    queue.offer(curr.left);
                } if (curr.right!=null){
                    queue.offer(curr.right);
                }
            }

            averagelvl =averagelvl/(queuesize);
            level.add(averagelvl);
            results.add(level);

        }
        return results;
    }


    // Next Successor
    public int nextsuccessor(int key){

        Queue<Node> queue = new LinkedList();
        queue.offer(root);

        while (!queue.isEmpty()){
            int queuesize = queue.size();

            for (int i = 0; i <queuesize ; i++) {
                Node curr = queue.poll();
                if (curr.val==key){
                    return queue.peek().val;
                }
                if (curr.left!=null) {
                    queue.offer(curr.left);
                }
                if (curr.right!=null) {
                    queue.offer(curr.right);
                }
            }
        }
        return -1;
    }
    // Pointing Every Node to its right Node in the same level
    public List<String> nextpointer() {
        List<String> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Node> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int queuesize = queue.size();

            for (int i = 1; i <= queuesize; i++) {
                Node curr = queue.poll();
                result.add(String.valueOf(curr.val));

                if (curr.left != null) {
                    curr.left.next=(curr.left.next==null)?curr.right:null;
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    curr.right.next =(curr.next!=null)?curr.next.left:null;
                    queue.offer(curr.right);
                }
            }
            result.add("#");

        }
        return result;
    }
    // Method 2
    public Node nextpointer2(){
        if (root==null){
            return null;
        }
       Node leftmost = root;
        while (leftmost.left!=null){
            Node Current = leftmost;
            while (Current!=null){
                Current.left.next=Current.right;
                if (Current.next!=null){
                    Current.right.next=Current.next.left;
                }
                Current=Current.next;
            }
            leftmost=leftmost.left;
        }
        return root;
    }

    //Zig-Zag
    public List<List<Integer>> Zig_Zag() {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) {
            return results;
        }
        boolean reverse = false;
        Deque<Node> deque = new LinkedList<>();
        deque.offer(root);

        while (!deque.isEmpty()) {
            int dequesize = deque.size();
            List<Integer> level = new ArrayList<>(dequesize);
            for (int i = 0; i < dequesize; i++) {
                if (!reverse) {
                    Node curr = deque.removeFirst();
                    level.add(curr.val);
                    if (curr.left != null) {
                        deque.addLast(curr.left);
                    }
                    if (curr.right != null) {
                        deque.addLast(curr.right);
                    }
                } else {
                    Node curr = deque.removeLast();
                    level.add(curr.val);
                    if (curr.right != null) {
                        deque.addFirst(curr.right);
                    }
                    if (curr.left != null) {
                        deque.addFirst(curr.left);
                    }
                }
            }
            reverse = !reverse;
            results.add(level);
        }
        return results;
    }

    // Is Cousin
    public boolean isCousin(Node node,int x,int y){
        Node xx = getNode(root,x);
        Node yy = getNode(root,y);
        return ((level(root,xx,0)==level(root,yy,0)) && (!issibling(root,xx,yy)));

    }
    public Node getNode(Node node,int x){
        if (node ==null){return null;}
        if(node.val ==x){
            return node;
        }
        Node finding = getNode(node.left,x);
        if (finding!=null){
            return finding;
        }
        return getNode(node.right,x);
    }
    public int level(Node node,Node x,int lvl){
        if (node==null){return 0;}
        if (node==x){
            return lvl;
        }
        int counter = level(node.left,x,lvl+1);
        if (counter!=0){ return counter;}
        return level(node.right,x,lvl+1);
    }
    public boolean issibling(Node node,Node x ,Node y){
        if (node==null){return false;}
        return ((node.left==x && node.right==y)||(node.left==y && node.right==x)||issibling(node.left,x,y)|| issibling(node.right,x,y));
    }

    // Is Symmetric
    public boolean IsSymmetric(Node node){
       Queue<Node> queue = new LinkedList<>();
       queue.offer(root.left);
       queue.offer(root.right);

       while (!queue.isEmpty()){
           Node lefts = queue.poll();
           Node rights = queue.poll();

           if (lefts==null && rights==null){
               continue;
           }
           if (lefts==null || rights==null){
               return false;
           }
           if (lefts.val != rights.val){
               return false;
           }
           queue.offer(lefts.left);
           queue.offer(rights.right);
           queue.offer(lefts.right);
           queue.offer(rights.left);
       }
       return true;
    }

    public static void main(String[] args) {
       BFS tree = new BFS();
       tree.bfsInsert(1);
       tree.bfsInsert(2);
       tree.bfsInsert(3);
       tree.bfsInsert(4);
       tree.bfsInsert(5);
       tree.bfsInsert(6);
       tree.bfsInsert(7);

       //// Printing a BFS Tree Levels
        //System.out.println(tree.bfsrep());

        // Reverse Order
        System.out.println(tree.bfsrev());

        // Print average of Every Level
        System.out.println(tree.avglvl());

        //Finding Next Successor of a Node
        System.out.println(tree.nextsuccessor(3));

        //Next Pointer
            //Method 1
            //System.out.println(tree.nextpointer());
            //Method 2
            //Node ref = tree.nextpointer2();

        //Zig-Zag
        System.out.println(tree.Zig_Zag());

        //Is Cousin Not Siblings
        System.out.println(tree.isCousin(root,3,4));

        // Is Symmetric

        BFS tree2 = new BFS();
        root = null;
        tree2.bfsInsert(1);
        tree2.bfsInsert(2);
        tree2.bfsInsert(2);
        tree2.bfsInsert(3);
        tree2.bfsInsert(4);
        tree2.bfsInsert(4);
        tree2.bfsInsert(3);
        List<List<Integer>> newtree = tree2.bfsrep();
        System.out.println(newtree);
        System.out.println(tree2.IsSymmetric(root));



    }

}



/*
BFS -----> https://leetcode.com/problems/binary-tree-level-order-traversal/description/
AVGLVL -----> https://leetcode.com/problems/binary-tree-level-order-traversal/description/
Zig-Zag ----> https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/submissions/1475574638/
Next Right Pointer ---->https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/
IsCousin --->https://leetcode.com/problems/cousins-in-binary-tree/description/
*/