import java.util.ArrayList;
import java.util.List;

public class N_aryTreePostorderTraversal {
    static class Node {
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
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();

        if(root == null){
            return result;
        }

        traverse(result, root);

        return result;
    }

    private void traverse(List<Integer> list, Node node){
        if(node != null){
            List<Node> children = node.children;
            for(Node child : children){
                traverse(list, child);
            }
        }
        list.add(node.val);
    }
}
