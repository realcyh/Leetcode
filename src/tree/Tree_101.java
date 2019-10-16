package tree;

public class Tree_101 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static boolean isMirror(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) return true;
        if (t1 == null || t2 == null) return false;
        return (t1.val == t2.val) &&
                isMirror(t1.left, t2.right) &&
                isMirror(t1.right, t2.left);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);

        boolean a;
        a = isMirror(root, root);
        System.out.println(a);


    }
}
