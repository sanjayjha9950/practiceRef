package data.structure.graph;

import java.util.*;

class Graph {
    private final Map<Integer, List<Edge>> adjacencyList;

    public Graph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    public Map<Integer, Integer> dijkstra(int source) {
        Map<Integer, Integer> distances = new HashMap<>();
        for (int node : adjacencyList.keySet()) {
            distances.put(node, Integer.MAX_VALUE); // Initialize all distances to infinity
        }
        distances.put(source, 0); // Distance to source is 0

        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(edge -> edge.weight));
        pq.add(new Edge(source, 0));

        while (!pq.isEmpty()) {
            Edge currentEdge = pq.poll();
            int currentNode = currentEdge.destination;

            for (Edge edge : adjacencyList.getOrDefault(currentNode, Collections.emptyList())) {
                int newDist = distances.get(currentNode) + edge.weight;
                if (newDist < distances.get(edge.destination)) {
                    distances.put(edge.destination, newDist);
                    pq.add(new Edge(edge.destination, newDist));
                }
            }
        }

        return distances;
    }

    private static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 3, 5);

        int source = 0;
        Map<Integer, Integer> distances = graph.dijkstra(source);

        System.out.println("Shortest distances from source " + source + ":");
        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            System.out.println("To node " + entry.getKey() + " = " + entry.getValue());
        }
    }
}

