package tree;

import java.util.LinkedList;
import java.util.List;

public class Tree_94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new LinkedList<>();
        print(root, l);
        return l;
    }

    public void print(TreeNode root, List<Integer> l) {
        if (root != null) {
            if (root.left != null) {
                print(root.left, l);
            }
            l.add(root.val);
            if (root.right != null) {
                print(root.right, l);
            }
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(3);
        TreeNode right = new TreeNode(7);
        TreeNode ll = new TreeNode(1);
        TreeNode lr = new TreeNode(4);
        root.left = left;
        root.right = right;
        left.left = ll;
        left.right = lr;

        Tree_94 s = new Tree_94();
        List<Integer> res = s.inorderTraversal(root);

        for (int i: res) {
            System.out.println(i);
        }


    }

}
