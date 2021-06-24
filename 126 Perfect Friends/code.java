import java.io.*;
import java.util.*;

public class Main {
   
   public static class Edge{
       int c;
       int nbr;
         Edge (int c , int nbr){
             this.c = c;
             this.nbr = nbr;
         }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      
      ArrayList<Edge>[] graph= new ArrayList[n];
      
      for(int i = 0; i< n; i++){
          graph[i]= new ArrayList();
      }
      
      
       for(int i = 0; i< k; i++){
           
           String s = br.readLine();
           String []sp=s.split(" ");
           
           int v1  = Integer.parseInt(sp[0]);
           int v2  = Integer.parseInt(sp[1]);
           
           
          graph[v1].add(new Edge(v1,v2));
          graph[v2].add(new Edge(v2,v1));
          
      }
      
      boolean []visited = new boolean[n];
      
      ArrayList<ArrayList<Integer>> comps = new ArrayList();
      for(int i =0 ; i< n ; i++){
          if(visited[i] == false){
        ArrayList<Integer> comp = new ArrayList();
         createTree(graph,i,visited,comp);  
         comps.add(comp);
          }
      }
      int total=0;
      for(int i =0; i< comps.size()-1; i++){
          for(int j =i+1 ; j< comps.size(); j++){
            int local =   comps.get(i).size() *comps.get(j).size();
            total+=local;
          }
      }
      
      System.out.println(total);
      
      // write your code here
   }
   
   public static void createTree(  ArrayList<Edge>[] graph,int src,boolean [] visited,ArrayList<Integer>comp){
       
       comp.add(src);
       visited[src]= true;
       
       for(Edge e :graph[src]){
           if(visited[e.nbr] == false){
                createTree(graph,e.nbr,visited,comp);  
           }
           
       }
       
   }








}