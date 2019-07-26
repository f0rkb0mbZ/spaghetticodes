import java.util.ArrayList;

class Graph {
    int V;
    ArrayList<Integer> adjListArray[];

    Graph(int V) {
        this.V = V;
        adjListArray = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new ArrayList<>();
        }
    }

    void addEdge(Graph graph, int src, int dest) {
        graph.adjListArray[src].add(dest);
        graph.adjListArray[dest].add(src); // for unidirected graph, every edge is both way connected.
    }

    void printGraph(Graph graph) {
        for (int v = 0; v < graph.V; v++) {
            System.out.println("Vertex "+ v);
            System.out.print("head ");
            for(Integer adj: graph.adjListArray[v]){
                System.out.print("-> " + adj);
            }
            System.out.println();
        }
    }
}

public class graphImpl {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 4);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 1, 4);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 4);

        graph.printGraph(graph);
    }
}