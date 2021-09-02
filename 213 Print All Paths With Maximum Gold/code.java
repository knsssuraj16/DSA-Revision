import java.io.*;
import java.util.*;

public class Main {

  private static class Pair {
    String psf;
    int i;
    int j;

    public Pair(String psf, int i, int j) {
      this.psf = psf;
      this.i = i;
      this.j = j;
    }
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int m = Integer.parseInt(br.readLine());
    int[][] arr = new int[n][m];

    for (int i = 0; i < n; i++) {
      String str = br.readLine();
      for (int j = 0; j < m; j++) {
        arr[i][j] = Integer.parseInt(str.split(" ")[j]);
      }
    }

    int [][]dp = new int[n][m];

    for (int j = m - 1; j >= 0; j--) {
      for (int i = 0 ; i < n ; i++) {
        if (j == m - 1) {
          dp[i][j] = arr[i][j];
        } else if (i == 0) {

          int max = Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
          dp[i][j] = max + arr[i][j];
        } else if (i == n - 1) {
          int max = Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
          dp[i][j] = max + arr[i][j];;
        } else {
          int max = Math.max(dp[i + 1][j + 1], Math.max(dp[i][j + 1], dp[i - 1][j + 1]));
          dp[i][j] = max + arr[i][j];;
        }
      }
    }
    int max = Integer.MIN_VALUE;
    int maxi = -1;
    for (int i = 0; i < n; i++) {

      if (max <= dp[i][0]) {
        max = dp[i][0];
        maxi = i;
      }
    }


    System.out.println(max);
    ArrayDeque<Pair> q = new ArrayDeque();
    for (int i = 0; i < n; i++) {
      if (max == dp[i][0]) {
        q.add(new Pair(maxi + "", i, 0));
      }
    }


    while (q.size() > 0) {
      Pair p = q.removeFirst();

      if (p.j == m-1 ) {
        System.out.println(p.psf);
      } else if (p.i == 0) {
        int loc = Math.max(dp[p.i][p.j + 1], dp[p.i + 1][p.j + 1]);

        if (loc == dp[p.i][p.j + 1]) {

          q.add(new Pair(p.psf + " d2", p.i, p.j + 1));
        }
        if (loc == dp[p.i + 1][p.j + 1]) {

          q.add(new Pair(p.psf + " d3", p.i + 1, p.j + 1));
        }

      } else if (p.i == n - 1) {

        int loc = Math.max(dp[p.i][p.j + 1], dp[p.i - 1][p.j + 1]);

        if (loc == dp[p.i - 1][p.j + 1]) {

          q.add(new Pair(p.psf + " d1", p.i - 1, p.j + 1));
        }
        if (loc == dp[p.i][p.j + 1]) {

          q.add(new Pair(p.psf + " d2", p.i, p.j + 1));
        }
       

      } else {
        int loc = Math.max(dp[p.i + 1][p.j + 1], Math.max(dp[p.i][p.j + 1], dp[p.i - 1][p.j + 1]));

        if (loc == dp[p.i - 1][p.j + 1]) {

          q.add(new Pair(p.psf + " d1", p.i -1, p.j + 1));
        }
        if (loc == dp[p.i][p.j + 1]) {

          q.add(new Pair(p.psf + " d2", p.i, p.j + 1));
        }
       
        if (loc == dp[p.i + 1][p.j + 1]) {

          q.add(new Pair(p.psf + " d3", p.i + 1, p.j + 1));
        }



      }


    }

  }





















}