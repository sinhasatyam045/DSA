package Graphs;

import java.util.*;

public class TopologicalSortUsingDFS {
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
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void topoSort(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topoSortUtil(graph, i, vis, st);
            }
        }
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
    }

    public static void topoSortUtil(ArrayList<Edge> graph[], int curr, boolean vis[], Stack<Integer> st) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topoSortUtil(graph, e.dest, vis, st);
            }
        }
        st.push(curr);
    }

    public static void main(String args[]) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        topoSort(graph);
    }

}
