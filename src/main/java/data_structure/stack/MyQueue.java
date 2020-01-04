package data_structure.stack;

public class MyQueue<T> {
    private class QueueNode<T> {
        private T data;
        private QueueNode<T> next;

        public QueueNode(T data) {
            this.data = data;
        }
    }

    QueueNode<T> first;
    QueueNode<T> last;

    public void add(T data) {
        QueueNode<T> newNode = new QueueNode<>(data);
        if(last != null) {
            last.next = newNode;
        }
        last = newNode;

        if(first == null) {
            first = last;
        }
    }

    public T remove() {
        if(first == null) return null;
        QueueNode<T> tmp = first;
        first = first.next;
        if(first == null) {
            last = null;
        }
        return tmp.data;
    }
}
