package data_structure.list;

public class MyList<T> {

    Node header = null;
    Node tail = null;
    long size = 0;

    public Node add(T value) {
        if(header == null) {
            header = new Node(null, null, value);
            tail = header;
        } else {
            header.next = new Node(null, header, value);
            header = header.next;
        }
        size++;
        return header;
    }

    public Node add(int position, T value) {
        if(position > size) return null;
        Node tmp = null;
        Node iterator = tail;
        int counter = 0;

        while(iterator != null) {
            if(counter == position) {
                tmp = new Node(iterator, iterator.parent, value);
                iterator.parent.next = tmp;
                iterator.parent = tmp;

                break;
            }
            iterator = iterator.next;
            counter ++;
        }
        return tmp;
    }

    public void show() {
        Node iterator = tail;
        while(iterator != null) {
            System.out.println(iterator.value);
            iterator = iterator.next;
        }
    }

    class Node {
        Node parent;
        Node next;
        T value;

        public Node(Node next, Node parent, T value) {
            this.next = next;
            this.parent = parent;
            this.value = value;
        }
    }
}
