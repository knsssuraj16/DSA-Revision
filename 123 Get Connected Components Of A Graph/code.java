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

    ArrayList<ArrayList<Integer>> comps = new ArrayList<>();
    boolean []visited = new boolean[graph.length];
    for (int i = 0; i < graph.length; i++) {
      if (visited[i] == false) {
        ArrayList<Integer> a =  getConnectedGraph(graph, visited, i);
        comps.add(a);
      }
    }
    System.out.println(comps);
  }

  public static ArrayList<Integer> getConnectedGraph( ArrayList<Edge>[] graph, boolean [] visited, int ele) {

    ArrayList <Integer> i = new ArrayList();


    i.add(ele);
    visited[ele] =  true;

    for (Edge e : graph[ele]) {
      if (visited[e.nbr] == false) {
        ArrayList <Integer> is =  getConnectedGraph(graph, visited, e.nbr);
        for (int a : is) {
          i.add(a);
        }
      }
    }

    return i;

  }


}










