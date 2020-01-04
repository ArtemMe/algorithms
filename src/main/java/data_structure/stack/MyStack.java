package data_structure.stack;

public class MyStack<T> {
    private class StackNode<T>{
        T data;
        StackNode<T> prev;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop(){
        if(top == null) return null;

        StackNode<T> result = top;
        top = top.prev;

        return result.data;
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);
        newNode.prev = top;
        top = newNode;
    }

    public T peek() {
        if(top !=null) return null;
        return top.data;
    }
}
