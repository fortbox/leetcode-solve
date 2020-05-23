/*
 * Copyright (c) 2020
 * Author: xiaoweixiang
 */

package finished.tree.finished.no431;

import java.util.ArrayList;
import java.util.List;

public class DfsCodec {
    // Encodes an n-ary tree to a binary tree.
    public TreeNode encode(Node root) {
        if (root == null) return null;
        TreeNode bRoot = new TreeNode(root.val);
        if (root.children != null && root.children.size() > 0) bRoot.left = encode(root.children.get(0));
        TreeNode node = bRoot.left;
        for (int i = 1; i < root.children.size(); i++) {
            node.right = encode(root.children.get(i));
            node = node.right;
        }
        return bRoot;
    }

    // Decodes your binary tree to an n-ary tree.
    public Node decode(TreeNode root) {
        if (root == null) return null;
        Node nRoot = new Node(root.val, new ArrayList<>());
        TreeNode bLeft = root.left;
        List<Node> children = nRoot.children;
        while (bLeft != null) {
            children.add(decode(bLeft));
            bLeft = bLeft.right;
        }
        return nRoot;
    }
}
