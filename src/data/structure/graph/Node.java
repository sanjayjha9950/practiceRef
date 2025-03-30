package data.structure.graph;

import java.util.ArrayList;
import java.util.List;

public class Node {
    String data;
    List<Edge> edges;

    public Node(String data) {
        this.data = data;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Node end,int weight){
        Edge edge = new Edge(this, end,weight);
        edges.add(edge);
    }

    public List<Edge> getEdges() {
        return edges;
    }


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
