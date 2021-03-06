package JianZhiOffer;

public class Solution16 {
    public void Mirror(TreeNode root) {
        if (root == null) {
            return;
        }

        swap(root);

        Mirror(root.left);
        Mirror(root.right);
    }

    private void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
}
