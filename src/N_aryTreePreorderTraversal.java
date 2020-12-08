import java.util.ArrayList;
import java.util.List;

public class N_aryTreePreorderTraversal {
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

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();

        if(root != null){
            traverse(list, root);
        }

        return list;
    }

    private void traverse(List<Integer> list, Node node){
        list.add(node.val);

        if(node != null){
            List<Node> children = node.children;
            for(Node n: children){
                traverse(list, n);
            }
        }
    }
}
