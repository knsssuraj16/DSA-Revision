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
   
   public static class Pair{
       int src;
       String psf;
       int level;
       Pair(int src,String psf,int level){
           this.src= src;
           this.psf= psf;
           this.level = level;
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

      int []visited=  new int[vtces];
      Arrays.fill(visited,-1);
      for(int i =0 ; i< vtces; i++){
          if(visited[i] == -1){
             if( checkBiaparite(graph,i,visited,0) == false){
                 System.out.println(false);
                 return;
             }
          }
      }
      System.out.println(true);
      
      
   }
   
   public static boolean checkBiaparite( ArrayList<Edge>[] graph,int i,int []visited,int level){
       
       Queue<Pair> q= new ArrayDeque();
       q.add(new Pair(i,i+"",level));
       
       while(q.size()> 0 ){
           Pair p = q.remove();
           if(visited[p.src] == -1){
                 visited[p.src] = p.level;
            }else{
                if(level != visited[p.src]){
                  return false;  
                }
            }
           
           for(Edge e: graph[p.src]){
               if(visited[e.nbr] == -1){
                   
                   q.add(new Pair(e.nbr,p.psf+e.nbr,p.level+1));
                  
               }
           }
       }
       
       return true;
       
   }
   
   

   
}