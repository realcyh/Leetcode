package tree;

public class Tree_543 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(7);
        root.left = left;
        root.right = right;
        Solution_543 s = new Solution_543();

        System.out.println(s.diameterOfBinaryTree(root));
    }
}

class Solution_543{
    int ans;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        return ans-1;
    }

    public int depth( TreeNode root) {
        if (root == null) return 0;
        int l = depth(root.left);
        int r = depth(root.right);
        ans = Math.max(ans, r+l+1);
        return Math.max(l,r)+1;
    }
}



