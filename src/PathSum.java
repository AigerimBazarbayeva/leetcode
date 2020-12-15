public class PathSum {
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

    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, sum, 0);
    }

    private boolean dfs(TreeNode node, int targetSum, int sumSoFar){

        if(node == null){
            return false;
        }

        sumSoFar += node.val;

        if(sumSoFar == targetSum && node.left == null && node.right == null){
            return true;
        }

        if(dfs(node.left, targetSum, sumSoFar) || dfs(node.right, targetSum, sumSoFar)){
            return true;
        }

        return false;
    }
}
