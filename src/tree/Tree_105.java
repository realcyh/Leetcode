package tree;

public class Tree_105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder, inorder, 0, 0, preorder.length-1);

    }

    private TreeNode helper(int[] preorder, int[] inorder, int pos, int start, int end) {
        if (start>end || pos>preorder.length-1) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[pos]);

        int index = 0;
        for (int i=start; i<=end; i++) {
            if (root.val == inorder[i]) {
                index = i;
                break;
            }
        }

        root.left = helper(preorder, inorder, pos+1, start, index-1);
        root.right = helper(preorder, inorder, pos+index-start+1, index+1, end);
        return root;
    }
}
