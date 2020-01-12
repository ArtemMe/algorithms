package data_structure.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
/**
 * Нагруженное дерево(префиксное дерево) - структура данных, которая позволяет хранить пары ключ-значние.
 * Ключами обычно выступают строки. Есть узлы промежуточные (lead = false) они не являются значением.
 * В каждом узле по символу. Скаладывая узды получаем ключ и путь до нужного узла
 *
 * */
public class Trie {
    TrieNode root = new TrieNode();

    public void put(String input) {
        TrieNode v = root;
        for(Character c : input.toLowerCase().toCharArray()) {
            if(!v.children.containsKey(c)) {
                v.children.put(c, new TrieNode());
            }
            v = v.children.get(c);
        }
        v.leaf = true;
    }

    public boolean find(String input) {
        TrieNode v = root;
        boolean result = true;
        for(Character c : input.toLowerCase().toCharArray()) {
            if(v.children.containsKey(c)) {
                v = v.children.get(c);
            } else {
                return false;
            }
        }
        return true;
    }

    static Map<Integer,String> levelSpacesMap = new HashMap<Integer,String>();

    static String getSpace(int level) {
        String result = levelSpacesMap.get(level);
        if (result == null) {
            StringBuilder sb = new StringBuilder();
            for (int i=0; i<level; i++) {
                sb.append(" ");
            }
            result = sb.toString();
            levelSpacesMap.put(level,result);
        }
        return result;
    }

    public static void printSorted(TrieNode node) {
        printSorted2(node,0);
    }

    private static void printSorted2(TrieNode node, int level) {
        for (Character ch : node.children.keySet()) {
            System.out.println(getSpace(level)+ch);
            printSorted2(node.children.get(ch), level+1);
        }
        if (node.leaf) {
            System.out.println();
        }
    }

    class TrieNode {
        TreeMap<Character, TrieNode> children = new TreeMap<>();
        boolean leaf;
    }

}
