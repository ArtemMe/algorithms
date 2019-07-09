package graph;


import org.junit.Test;

public class TestGrapth {

    @Test
    public void validTest(){
        Node n1 = new Node(25);
        Node n2 = new Node(1);
        Node n3 = new Node(27);
        Node n4 = new Node(8);
        Node n5 = new Node(4);
        Node n6 = new Node(3);
        Node n7 = new Node(7);
        Node n8 = new Node(9);
        Node n9 = new Node(6);
        Node n10 = new Node(5);
        Node n11 = new Node(11);
//        Node n12 = new Node(103);

        n1.setChild(new Node[]{n2, n3, n4});
        n2.setChild(new Node[]{n5, n6, n7});
        n3.setChild(new Node[]{n8});
        n4.setChild(new Node[]{n9, n10});
        n9.setChild(new Node[]{n1, n11});
//        n11.setChild(new Node[]{n12});

        MyGraph g = new MyGraph();
        g.setNode(n1);

        System.out.println(g.searchInWidth(103));
    }
}
