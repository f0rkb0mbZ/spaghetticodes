import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

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
            System.out.println("Vertex " + v);
            System.out.print("head ");
            for (Integer adj : graph.adjListArray[v]) {
                System.out.print("-> " + adj);
            }
            System.out.println();
        }
    }

    void BFS(int s) {
        boolean[] visited = new boolean[this.V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s + " ");
            Iterator<Integer> i = this.adjListArray[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
            // System.out.println(queue);
        }
    }

    void DFS(int s) {
        boolean[] visited = new boolean[this.V];
        Stack<Integer> stck = new Stack<>();

        visited[s] = true;
        stck.push(s);

        while (stck.size() != 0) {

            s = stck.peek();
            stck.pop();

            if (!visited[s]) {
                System.out.println(s + " ");
                visited[s] = true;
            }

            Iterator<Integer> i = this.adjListArray[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    stck.push(n);
                }
            }
        }
    }
}

public class graphBFS {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        // graph.addEdge(graph, 0, 1);
        // graph.addEdge(graph, 0, 4);
        // graph.addEdge(graph, 1, 2);
        // graph.addEdge(graph, 1, 3);
        // graph.addEdge(graph, 1, 4);
        // graph.addEdge(graph, 2, 3);
        // graph.addEdge(graph, 3, 4);

        // g.addEdge(g, 0, 1);
        // g.addEdge(g, 0, 2);
        // g.addEdge(g, 1, 2);
        // g.addEdge(g, 2, 0);
        // g.addEdge(g, 2, 3);
        // g.addEdge(g, 3, 3);

        g.addEdge(g, 1, 0); 
        g.addEdge(g, 0, 2); 
        g.addEdge(g, 2, 1); 
        g.addEdge(g, 0, 3); 
        g.addEdge(g, 1, 4);

        // graph.printGraph(graph);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        g.BFS(num);
        System.out.println();
        g.DFS(num);
        sc.close();
    }
}
