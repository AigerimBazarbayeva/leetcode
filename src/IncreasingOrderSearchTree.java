import java.util.ArrayList;
import java.util.List;

public class IncreasingOrderSearchTree {
    public static class TreeNode {
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

    public TreeNode increasingBST(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root != null){
            traverse(result, root);
        }

        TreeNode last = new TreeNode();
        TreeNode resRoot = last;

        for(Integer i: result){
            TreeNode node = new TreeNode();
            node.val = i;
            last.right = node;
            last = node;
        }
        resRoot = resRoot.right;
        return resRoot;
    }

    private void traverse(List<Integer> list, TreeNode node){
        if(node.left != null){
            traverse(list, node.left);
        }

        list.add(node.val);

        if(node.right != null){
            traverse(list, node.right);
        }
    }
}
