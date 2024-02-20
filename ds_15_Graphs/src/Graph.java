import java.util.ArrayList;
import java.util.List;

public class Graph {

    // Adjacency
    List<List<Vertex>> adjList = new ArrayList<>();

    public Graph(List<Edge> edges) {
        // construct Adjacency List
        // create an empty arraylist for each AdjList element
        for (int i = 0; i < edges.size(); i++) {
            adjList.add(i, new ArrayList<>());
        }

        // add vertices connected to current vertex
        for (Edge each : edges) {
            adjList.get(each.from).add(new Vertex(each.to, each.weight));
        }
    }

    public static void printGraph(Graph graph) {
        int fromVertex = 0;
        System.out.println("\nPrinting the relationships on the graph\n");
        while (fromVertex < graph.adjList.size()) {

            for (Vertex v : graph.adjList.get(fromVertex)) {
                System.out.println("Vertex: " + fromVertex + " =====(" + v.weight + ")====> " + v.value);
            }
            fromVertex++;
        }
    }

}
