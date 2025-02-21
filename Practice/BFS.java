package Practice;
import java.util.*;
public class BFS {
    static class Edge{
        int src,dest,wt;
        Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void createGraph(ArrayList<ArrayList<Edge>>g,int V,int E,Scanner sc){
        for(int i=0;i<V;i++){
            g.add(new ArrayList<>());
        }
            for(int i=0;i<E;i++){
                int src=sc.nextInt();
                int dest=sc.nextInt();
                int wt=sc.nextInt();
                g.get(src).add(new Edge(src,dest,wt));
            }
        
    }

    public static void bfs(ArrayList<ArrayList<Edge>>g,int V, int source){
        Queue<Integer>q=new LinkedList<>();
        boolean vis[]=new boolean[V];
        q.add(source);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!vis[curr]){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<g.get(curr).size();i++){
                    Edge e=g.get(curr).get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<ArrayList<Edge>>g,int V,int source,boolean vis[]){
         
        vis[source]=true;
        System.out.print(source+" ");
        for(int i=0;i<g.get(source).size();i++){
            Edge e=g.get(source).get(i);
            if(!vis[e.dest]){
                dfs(g,V,e.dest,vis);
            }
        }
    }



    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int V=sc.nextInt();
        int E=sc.nextInt();
        ArrayList<ArrayList<Edge>>g=new ArrayList<>();
        int source=sc.nextInt();
        createGraph(g,V,E,sc);
        bfs(g,V,source);
        boolean vis[]=new boolean[V];
        dfs(g,V,source,vis);
        
    }
    
}
