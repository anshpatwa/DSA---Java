package Questions;

public class BFS2 {
    TreeNode root;
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
       public TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
  public boolean path_sum(TreeNode node, int targetsum){
      if (node == null) {
          return false;
      }
      return helper(node, 0, targetsum);
  }
    public boolean helper(TreeNode node, int currentSum, int targetsum) {
        if (node == null) {
            return false;
        }
        currentSum += node.val;
        if (node.left == null && node.right == null) {
            return currentSum == targetsum;
        }
        return helper(node.left, currentSum, targetsum) || helper(node.right, currentSum, targetsum);
    }

    public static void main(String[] args) {
    BFS2 tree = new BFS2();
        TreeNode root = tree.new TreeNode(5);
        root.left = tree.new TreeNode(4);
        root.right = tree.new TreeNode(8);
        root.left.left = tree.new TreeNode(11);
        root.right.left = tree.new TreeNode(13);
        root.right.right = tree.new TreeNode(4);
        root.left.left.left = tree.new TreeNode(7);
        root.left.left.right = tree.new TreeNode(2);
        root.right.right.right = tree.new TreeNode(1);

        System.out.println(tree.path_sum(root,22));
    }
}
