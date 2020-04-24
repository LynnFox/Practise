
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        //如果有0或者1个节点
        if (root==null||(root.left == null && root.right == null))
            return root;
            
        //交换左右子树
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        root.left = mirrorTree(root.left);//镜像左子树的左右子树
        root.right = mirrorTree(root.right);//镜像右子树的左右子树
        return root;
    }
}
