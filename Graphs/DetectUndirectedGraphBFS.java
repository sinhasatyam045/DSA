package Graphs;
import java.util.*;

public class DetectUndirectedGraphBFS {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[9].add(new Edge(9, 5));
        graph[9].add(new Edge(9, 1));

        graph[1].add(new Edge(1, 9));
        graph[1].add(new Edge(1, 5));

        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 9));
        graph[5].add(new Edge(5, 2));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 5));

        graph[4].add(new Edge(4, 2));
    }

    public static boolean checkCycle(ArrayList<Edge> graph[]) {
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (checkCycleUtil(graph, i, vis, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkCycleUtil(ArrayList<Edge> graph[], int start, boolean vis[], int par) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while (!q.isEmpty()) {
            int curr = q.remove();
            vis[curr] = true;
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(e.dest);
                } else if (e.dest != par) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int V = 5; // Corrected to match the number of vertices in the graph
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        boolean hasCycle = checkCycle(graph);
        System.out.println("Does the graph have a cycle? " + hasCycle);
    }
}
