import java.util.*;

public class BinaryTreeLevelOrderTraversal_ii {
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

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> reversed = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        Map<TreeNode, Integer> level = new HashMap<>();

        if(root == null){
            return result;
        }
        queue.add(root);
        level.put(root, 0);

        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            int nodeLevel = level.get(node);

            while(result.size() - 1 < nodeLevel){
                result.add(new ArrayList<>());
            }
            result.get(nodeLevel).add(node.val);

            if(node.left != null){
                level.put(node.left, nodeLevel + 1);
                queue.add(node.left);
            }
            if(node.right != null){
                level.put(node.right, nodeLevel + 1);
                queue.add(node.right);
            }
        }

        for(int j = result.size() - 1; j >= 0; j--){
            reversed.add(result.get(j));
        }

        return reversed;
    }
}
