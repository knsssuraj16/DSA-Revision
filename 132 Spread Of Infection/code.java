import java.io.*;
import java.util.*;

public class Main {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   public static class Pair{
       int src;
       int level;
       Pair(int src,int level){
           this.src = src;
           this.level= level;
           
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      System.out.println(caInPeople(graph,src,t));
   }

    public static int caInPeople(ArrayList<Edge>[] graph,int src,int t){
        int count =0;
        
        Queue<Pair> q= new ArrayDeque();
        q.add(new Pair(src,0));
       
        
        boolean [] visited= new boolean[graph.length];
        while(q.size() > 0 ){
            
            Pair p = q.remove();
            
           
            if(visited[p.src] == true){
                continue;
            } 
            if(p.level == t){
                return count;
            }
             if(p.level < t){
                count++;
            }
            visited[p.src] = true;
            
            
            for(Edge e: graph[p.src]){
                if(visited[e.nbr] == false){
                    q.add(new Pair(e.nbr,p.level+1));
                }
            }
        }
        
        return count;
    }














}