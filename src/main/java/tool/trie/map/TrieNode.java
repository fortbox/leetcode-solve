package tool.trie.map;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    boolean isLeaf;
    Map<Character,TrieNode> next;

    public TrieNode() {
        next=new HashMap<>();
    }
}
