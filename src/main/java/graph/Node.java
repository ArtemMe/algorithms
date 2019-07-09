package graph;

public class Node {
    Integer id;
    Node[] child;

    public Node(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Node[] getChild() {
        return child;
    }

    public void setChild(Node[] child) {
        this.child = child;
    }

    @Override
    public boolean equals(Object o) {
       return getId().equals(((Node)o).getId());
    }

}
