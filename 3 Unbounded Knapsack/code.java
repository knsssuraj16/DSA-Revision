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
    int []dp = new int [cap+1];
    dp[0]=0;
    for(int i= 1; i<dp.length; i++){
        for(int j= 0; j<n; j++){
            if( wei[j] <= i ){
                int tot= dp[i - wei[j]]+val[j];
                dp [i] = Math.max(dp[i],tot);
            }
        }
    }
    System.out.println(dp[cap]);

    }
}