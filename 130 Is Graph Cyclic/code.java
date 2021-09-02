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
  public static class Pair {
    int src;
    String psf;
    Pair(int src, String psf) {
      this.src = src;
      this.psf = psf;
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
    boolean [] visited =  new boolean[graph.length];
    for (int i = 0 ; i < vtces; i++) {
      if (visited[i] == false) {
        if (checkGraph(graph, i, visited) == true) {
             System.out.println(true);
          return;
        }
      }

    }
    System.out.println(false);
  }


    public static boolean checkGraph(ArrayList<Edge>[] graph, int src, boolean [] visited) {

      Queue<Pair> q = new ArrayDeque();

      q.add(new Pair(src, src + ""));

      while (q.size() > 0) {

        Pair p = q.remove();
        if (visited[p.src] == true) {
          
          return true;
        }
        visited[p.src] = true;

        for (Edge e : graph[p.src]) {

          if (visited[e.nbr] == false) {
            q.add(new Pair(e.nbr, p.psf + e.nbr));
          }

        }
      }
      return false;
    }





  }