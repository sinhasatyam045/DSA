package Practice;
import java.lang.reflect.Array;
import java.util.*;

public class FindShortest {
    static class Edge {
        int src, dest, wt;

        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<ArrayList<Edge>> graph, int V, int E, Scanner sc) {
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < E; i++) {
            int src = sc.nextInt();
            int dest = sc.nextInt();
            int wt = sc.nextInt();
            graph.get(src).add(new Edge(src, dest, wt));
        }
    }

    public static int findShortestPath(ArrayList<ArrayList<Edge>> graph, int source, int destination, int V, int E) {
        int dist[] = new int[V];
        for (int i = 0; i < dist.length; i++) {
            if (i != source) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                Edge e = graph.get(i).get(j);
                int u = e.src;
                int v = e.dest;
                int wt = e.wt;
                if (dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
        return dist[destination];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        ArrayList<ArrayList<Edge>> g = new ArrayList<>();
        int source = sc.nextInt();
        int destination = sc.nextInt();
        createGraph(g, V, E, sc);
        int shortestDistance = findShortestPath(g, source, destination, V, E);
        System.out.println(shortestDistance);
    }
}
