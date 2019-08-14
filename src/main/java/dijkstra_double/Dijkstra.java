package dijkstra_double;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Dijkstra {
    public static Graph calculateShortestPathFromSource(Graph graph, Node source){
        source.setDistance(0);

        Set<Node> processed = new HashSet<>();
        Set<Node> unprocessed = new HashSet<>();

        unprocessed.add(source);

        while (!unprocessed.isEmpty()) {
            Node current = getLowerDistanceNode(unprocessed);

            for(Map.Entry<Node, Integer> e : current.getAdjastmentNode().entrySet()) {
                Node node = e.getKey();
                Integer value = e.getValue();

                if(!processed.contains(node)) {
                    calculateDistance(node, current, value);
                    unprocessed.add(node);
                }

            }
            processed.add(current);
            unprocessed.remove(current);
        }
        return graph;
    }

    public static void calculateDistance(Node evaluateNode, Node sourceNode, Integer value){

        if(sourceNode.getDistance() + value < evaluateNode.getDistance()) {
            evaluateNode.setDistance(sourceNode.getDistance() + value);
            LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortPart());
            shortestPath.add(sourceNode);
            evaluateNode.setShortPart(shortestPath);
        }
    }

    public static Node getLowerDistanceNode(Set<Node> nodes){
        int minDist = Integer.MAX_VALUE;
        Node minNode = null;

        for(Node n : nodes){
            if(n.getDistance() < minDist) {
                minDist = n.getDistance();
                minNode = n;
            }
        }
        return minNode;
    }
}

