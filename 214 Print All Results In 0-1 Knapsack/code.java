import java.io.*;
import java.util.*;

public class Main {

  public static class Pair {
    int i ;
    int j;
    String psf;
    Pair(int i, int j, String psf) {
      this.i = i;
      this.j = j;
      this.psf = psf;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());

    int[] values = new int[n];
    String str1 = br.readLine();
    for (int i = 0; i < n; i++) {
      values[i] = Integer.parseInt(str1.split(" ")[i]);
    }

    int[] wts = new int[n];
    String str2 = br.readLine();
    for (int i = 0; i < n; i++) {
      wts[i] = Integer.parseInt(str2.split(" ")[i]);
    }

    int caps = Integer.parseInt(br.readLine());

    int [][]dp = new int [n + 1][caps + 1];

    for (int i = 0; i <= n; i++) {
      for (int j = 0; j <= caps; j++) {
        if (i == 0 || j == 0) {
          dp[i][j] = 0;
        } else {
          int val = values[i - 1];
          int cap = wts[i - 1];

          dp[i][j] = dp[i - 1][j];

          if (j - cap >= 0) {
            int inc = 0;
            inc = dp[i - 1][j - cap] + val;
            int ex = dp[i - 1][j];
            if (inc > ex)
              dp[i][j] = inc;
          }

        }
      }
    }


    System.out.println(dp[n][caps]);

    ArrayDeque<Pair> q = new ArrayDeque<>();

    q.add(new Pair (n, caps, ""));
    while (q.size() > 0 ) {
      Pair p = q.removeFirst();

      if (p.i == 0 || p.j == 0) {
        System.out.println(p.psf);
      } else {
        int val = values[p.i - 1];// 30
        int cap = wts[p.i - 1]; //4

        
        if (p.j >= cap) {
          int inc = dp[p.i - 1][p.j - cap] + val;
          if (inc == dp[p.i][p.j])
          {
            q.add(new Pair (p.i - 1, p.j - cap, p.i-1 + " "+p.psf));
          }
        }
        
        int ex = dp[p.i - 1][p.j];
        if (ex == dp[p.i][p.j])
        {

          q.add(new Pair (p.i - 1, p.j,p.psf));
        }
      }
    }


  }
















}








