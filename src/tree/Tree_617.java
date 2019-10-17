package tree;

public class Tree_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode res = new TreeNode(0);
        if (t1 == null && t2 == null) return null;
        if (t1 == null) {
            res = t2;
        } else if (t2 == null) {
            res = t1;
        } else {
            res.val = t1.val+t2.val;
            res.left = mergeTrees(t1.left, t2.left);
            res.right = mergeTrees(t1.right, t2.right);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode l = new TreeNode(2);
        TreeNode r = new TreeNode(3);
         Tree_617 s = new Tree_617();
         TreeNode res = s.mergeTrees(l,r);
         System.out.println(res.val);

    }
}
