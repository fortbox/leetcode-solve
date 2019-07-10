package No559_N叉树的最大深度;


import java.util.List;

class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.children == null||root.children.size()==0) {
            return 1;
        }
        int size=0;
        for (Node node :
                root.children) {
            int temp = maxDepth(node);
            if (temp > size) {
                size = temp;
            }
        }
        return 1 + size;
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
