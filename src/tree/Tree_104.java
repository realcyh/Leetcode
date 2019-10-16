package tree;

import math.Math_279;

public class Tree_104 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1+Math.max( maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        int i=0;
        TreeNode root = new TreeNode(2);

        i = maxDepth(root);
        System.out.println(i);

    }
}
