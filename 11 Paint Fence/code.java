import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int k =scan.nextInt();
        
        int [][]dp= new int[3][n+1];
        //0 index is for two consucative ii.
        // 1 indexis used for not consucative.
        // 2 is addition of both index.
        for(int i =2; i<=n; i++){
            if(i ==2 ){
            dp[0][i]= k*1;
            dp[1][i]= k*(k-1);
            
            }else{
                dp[0][i] = dp[1][i-1];
                dp[1][i] = dp[2][i-1]*(k-1);
                
            }
            
            dp[2][i]= dp[0][i]+dp[1][i];
            
            
        }
        
        System.out.println(dp[2][n]);

    }
}