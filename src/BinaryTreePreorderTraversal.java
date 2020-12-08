import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if(root != null){
            traverse(result, root);
        }

        return result;
    }

    private void traverse(List<Integer> list, TreeNode node){

        list.add(node.val);

        if(node.left != null){
            traverse(list, node.left);
        }

        if(node.right != null){
            traverse(list, node.right);
        }
    }
}