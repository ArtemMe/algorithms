package graph;

import java.util.*;

public class MyGraph {

    Node node;

    public Integer searchInWidth(Integer id){
        Queue<Node> nodeQueue = new ArrayDeque<Node>();
        nodeQueue.add(node);
        Set<Node> checked = new HashSet<Node>();

        while (!nodeQueue.isEmpty()){
            Node n = nodeQueue.poll();

            if(n.getId().equals(id)) return n.getId();

            if(!checked.contains(n)) // чтобы не было зацикливания
                if(n.getChild() != null) nodeQueue.addAll(Arrays.asList(n.getChild()));

            checked.add(n);
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
