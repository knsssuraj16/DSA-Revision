import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int[] prices) {
   
    int dp[]= new int [prices.length+1];
    dp[0]=0;
    for(int i =1; i<= prices.length; i++){
        dp[i] = prices[i-1];
        
        int j =1; 
        int k = i-1;
        
        while(j <= k){
            
            if(dp[i] < (dp[j]+dp[k])){
               dp[i] = dp[j]+dp[k];
            }
            j++;
            k--;
        }
    }

    return dp[prices.length];
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] prices = new int[n];
    for (int i = 0; i < n; i++) {
      prices[i] = scn.nextInt();
    }
    System.out.println(solution(prices));
  }

}