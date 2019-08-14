package dijkstra_double;

import java.util.HashMap;
import java.util.LinkedList;

public class Node {
    private String value;
    private int distance = Integer.MAX_VALUE;
    private LinkedList<Node> shortPart = new LinkedList<>();
    private HashMap<Node, Integer> adjastmentNode = new HashMap<>();

    public void addDestination(Node node, Integer distance) {adjastmentNode.put(node, distance);}

    public Node(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public LinkedList<Node> getShortPart() {
        return shortPart;
    }

    public void setShortPart(LinkedList<Node> shortPart) {
        this.shortPart = shortPart;
    }

    public HashMap<Node, Integer> getAdjastmentNode() {
        return adjastmentNode;
    }

    public void setAdjastmentNode(HashMap<Node, Integer> adjastmentNode) {
        this.adjastmentNode = adjastmentNode;
    }
}
