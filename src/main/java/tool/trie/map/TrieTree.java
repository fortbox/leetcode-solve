package tool.trie.map;

public class TrieTree {
    private TrieNode root;

    public TrieTree() {
        root = new TrieNode();
    }

    public void insert(String word) {
        if (word == null || word.length() == 0) return;
        TrieNode node = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            TrieNode tmp = node.next.get(c);
            if (tmp == null) {
                tmp = new TrieNode();
                node.next.put(c, tmp);
            }
            node = node.next.get(c);
        }
        node.isLeaf = true;
    }

    public boolean search(String word) {
        if (word == null || word.length() == 0) return false;
        TrieNode node = root;
        int len = word.length();
        for (int i = 0; i < len; i++) {
            char c = word.charAt(i);
            TrieNode tmp = node.next.get(c);
            if (tmp == null) return false;
            node = node.next.get(c);
        }
        return node.isLeaf;
    }
}
