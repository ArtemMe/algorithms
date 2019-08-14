package dijkstra_double;

import java.util.HashSet;
import java.util.Set;

public class Graph {
    private Set<Node> nodes = new HashSet<>();

    public void addNode(Node n) {
        nodes.add(n);
    }
}
