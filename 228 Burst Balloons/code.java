import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int[] arr) {
    int n= arr.length;
    int dp[][]=new int [n][n];
    
    for (int g=0; g<n ; g++){
        for(int i =0,j=g;j<n ;i++,j++){
           int max = Integer.MIN_VALUE;
           for (int k= i; k<=j;k++){
               int l = k == i? 0 : dp[i][k-1];
               int r = k == j ? 0 : dp[k+1][j];
               
               int val = arr[k]* (i== 0? 1:arr[i-1])* (j == n-1? 1:arr[j+1]);
               int tot= l+r+val;
               if(tot > max){
                   max = tot;
               }
           }
           dp[i][j]= max;
        }
    }

    return dp[0][n-1];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }

}