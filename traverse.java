import java.util.*;

public class traverse {
    static class Edge {
        int src, dest, wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int V, int E, Scanner scanner) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }
        System.out.println("Enter edges in the format: source destination weight");
        for (int i = 0; i < E; i++) {
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            int wt = scanner.nextInt();
            graph[src].add(new Edge(src, dest, wt));
        }
    }

    public static void bfs(ArrayList<Edge> graph[], int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean visit[] = new boolean[V];
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!visit[curr]) {
                System.out.print(curr + " ");
                visit[curr] = true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int V = sc.nextInt();
        ArrayList<Edge> graph[] = new ArrayList[V];
        System.out.println("Enter the number of edges:");
        int E = sc.nextInt();
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph, V, E, sc);
        bfs(graph, V);
        sc.close();
    }

}
