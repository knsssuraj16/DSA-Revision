import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   public static class Pair implements Comparable<Pair>{
       int src;
       String psf;
       int wei;
       
       Pair(int src,String psf,int wei){
           this.src = src;
           this.psf = psf;
           this.wei = wei;
       }
       
       public int compareTo(Pair o){
           return this.wei-o.wei;
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());
     
      findSortestPath(graph,src,vtces-1);
      
   }
   
  public static void findSortestPath(ArrayList<Edge>[] graph,int src,int dest)
  {
      boolean []visited= new boolean[graph.length];
      PriorityQueue<Pair> pq= new PriorityQueue();
      pq.add(new Pair(src,src+"",0));
      
      while(pq.size() > 0){
          Pair  p = pq.remove();
          
          if(visited[p.src] ==  true){
              continue;
          }
          System.out.println(p.src+" via "+p.psf+" @ "+p.wei);
          
          visited[p.src] = true;
          
          for(Edge e: graph[p.src]){
              if(visited[e.nbr] == false){
                  pq.add(new Pair(e.nbr,p.psf+e.nbr,e.wt+p.wei));
              }
          }
      }
  }
   
   
   
   
   
   
   
   
   
   
   
}