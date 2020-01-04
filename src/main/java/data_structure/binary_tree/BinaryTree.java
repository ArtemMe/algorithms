package data_structure.binary_tree;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Добавление элемента: O(log(n))
 * Получение, удаление элемента: O(log(n)), в худшем случае O(n)
 * */

public class BinaryTree <T> {
    class Node {
        Node left;
        Node right;
        T data;

        Node(T data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    private Comparator<T> comparator;
    private Node root = null;

    public void add(T data) {
        if(root == null) {
            root = new Node(data);
        }
        add(root, data);
    }

    private Node add(Node current, T data) {
        if(current == null) {
            return new Node(data);
        }

        if(comparator.compare(current.data, data) > 0) {
            current.left = add(current.left, data);
        } else if(comparator.compare(current.data, data) < 0) {
            current.right = add(current.right, data);
        } else {
            return current;
        }

        return current;
    }

    public void delete(T data) {
        delete(root, data);
    }

    private Node delete(Node current, T data) {
        if(current == null) return null;

        if(comparator.compare(current.data, data) == 0) {
            if(current.left == null && current.right == null) { // если у нас лист
                return null;
            } else if(current.left == null) { // если левый
                return current.right;
            } else if(current.right == null){ // или правый пусыне то просто меняем ссылка
                return current.left;
            } else { // если и левй и правый ребенок есть то переходим в правую ветку и ищем наименьшее значение
                Node smallestNode = findSmallest(current);
                current.data = smallestNode.data;
                current.right = delete(current.right, smallestNode.data);
            }
        }
        if(comparator.compare(current.data, data) > 0){
            current.left = delete(current.left, data);
            return current;
        }

        current.right = delete(current.right, data);
        return current;
    }

    private Node findSmallest(Node current) {
        return current.left == null ? current : current.left;
    }

    /**
     * Поиск в глубину
     * */
    public T deepSearch(T data) {
        Node result = deepSearch(root, data);
        if (result != null) return result.data;

        return null;
    }

    private Node deepSearch(Node current, T data) {
        if(current != null) {
            if(comparator.compare(current.data, data) == 0) {
                return current;
            }

            Node leftR = deepSearch(current.left, data);

            if(leftR != null) return leftR;

            Node rightR = deepSearch(current.right, data);

            if(rightR != null) return rightR;
        }
        return null;
    }

    public T searchInWidth(T data) {
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(root);

        while(!nodes.isEmpty()) {
            Node node = nodes.remove();

            if(comparator.compare(node.data, data) == 0) {
                return node.data;
            }

            if(node.left != null) nodes.add(node.left);
            if(node.right != null) nodes.add(node.right);
        }

        return null;
    }

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }
}
