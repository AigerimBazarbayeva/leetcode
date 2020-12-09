import java.util.*;

public class N_aryTreeLevelOrderTraversal {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> result = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        Map<Node, Integer> level = new HashMap<>();

        if(root == null){
            return result;
        }

        queue.add(root);
        level.put(root, 0);


        while(!queue.isEmpty()){
            Node node = queue.remove();
            int nodeLevel = level.get(node);

            while(result.size() - 1 < nodeLevel){
                result.add(new ArrayList<>());
            }

            result.get(nodeLevel).add(node.val);

            if(node != null){
                List<Node> children = node.children;
                for(Node child: children){
                    level.put(child, nodeLevel + 1);
                    queue.add(child);
                }
            }
        }

        return result;
    }
}
