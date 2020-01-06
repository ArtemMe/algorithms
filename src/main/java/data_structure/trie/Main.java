package data_structure.trie;

import static data_structure.trie.Trie.printSorted;

public class Main {
    // Usage example
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.put("hello");
        trie.put("house");
        trie.put("hell");
        trie.put("world");
        System.out.println(trie.find("hello"));
        printSorted(trie.root);
    }
}
