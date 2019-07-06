package graph;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class MyGraph {

    Node node;

    public Integer searchInWidth(Integer id){
        Queue<Node> nodeQueue = new ArrayDeque<Node>();
        nodeQueue.add(node);

        while (!nodeQueue.isEmpty()){
            Node n = nodeQueue.poll();

            if(n.getId().equals(id)) return n.getId();
            if(n.getChild() != null) nodeQueue.addAll(Arrays.asList(n.getChild()));
        }

        return null;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }
}
