package Graphs;

import java.util.*;

public class BipartileGraph {
    static class Edge {
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();

        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }

    public static boolean isBipartile(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];
        for (int i = 0; i < graph.length; i++) {
            col[i] = -1;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < graph.length; i++) {
            q.add(i);
            col[i] = 0;
            while (!q.isEmpty()) {
                int curr = q.remove();
                for (int j = 0; j < graph[curr].size(); j++) {
                    Edge e = graph[curr].get(j);
                    if (col[e.dest] == -1) {
                        int nextcol = col[curr] == 0 ? 1 : 0;
                        col[e.dest] = nextcol;
                        q.add(e.dest);
                    } else if (col[e.dest] == col[curr]) {
                        return false;
                    }
                }
            }

        }

        return true;
    }

    public static void main(String args[]) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.print(isBipartile(graph));
    }

}
