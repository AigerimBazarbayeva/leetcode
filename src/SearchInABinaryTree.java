public class SearchInABinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    TreeNode res = new TreeNode();

    public TreeNode searchBST(TreeNode root, int val) {

        if(root != null){
            traverse(root, val);
        }

        if(res.val != val){
            return null;
        }

        return res;
    }

    private void traverse(TreeNode node, int val){

        if( node != null && node.val == val){
            res = node;
        }

        if(node.val < val){
            if(node.right != null){
                traverse(node.right, val);
            }
        }else{
            if(node.left != null){
                traverse(node.left, val);
            }
        }
    }
}
