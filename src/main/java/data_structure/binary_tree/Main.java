package data_structure.binary_tree;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
        tree.setComparator(comparator);

        tree.add(33);
        tree.add(5);
        tree.add(1);
        tree.add(20);
        tree.add(4);
        tree.add(17);
        tree.add(31);
        tree.add(35);
        tree.add(99);

        tree.delete(5);

        Integer res = tree.deepSearch(5);
        Integer res2 = tree.searchInWidth(5);
        System.out.println();
    }
}
