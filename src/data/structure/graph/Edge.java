package data.structure.graph;

public class Edge {
    private Node start;
    private Node end;
    private Integer weight;

    public Edge(Node source, Node target,int weight) {
        this.start = source;
        this.end = target;
        this.weight = weight;
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
