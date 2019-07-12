package No590_N叉树的后序遍历;

import java.util.ArrayList;
import java.util.List;


class Solution {
    List list = new ArrayList<Integer>();

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return list;
        }
        nn(root);
        return list;
    }
    private void nn(Node root){
        if (root==null) return;
        for (Node node : root.children) {
            System.out.println("node.val = " + node.val);
            nn(node);
        }
        list.add(root.val);
    }

    // Definition for a Node.
    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}