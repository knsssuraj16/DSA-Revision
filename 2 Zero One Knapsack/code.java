import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int []val= new int[n];
        for(int i =0 ; i< n ; i++){
            val[i]= scan.nextInt();
        }
        int []wei= new int[n];
        for(int i =0 ; i< n ; i++){
            wei[i]= scan.nextInt();
        }
        
        int cap= scan.nextInt();
        
        int [][]dp= new int[n+1][cap+1];
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=cap; j++){
                
                if (j< wei[i-1]){
                    dp[i][j] = dp[i-1][j];
                    
                }else if (j >= wei[i-1]){
                    
                    int diff= j -wei[i-1];
                    int leftTot = dp[i-1][diff]+val[i-1];
                    int righTot = dp[i-1][j];
                    dp[i][j] = Math.max(leftTot,righTot);
                }
            } 
        }
        System.out.println( dp[n][cap]);

    }
}