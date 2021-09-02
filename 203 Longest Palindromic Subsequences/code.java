import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        int dp[][] = new int[n][n];
        
        for(int g =0; g< n; g++)
        for (int i =0, j= g;j < n; j++,i++){
   
                if(g == 0){
                    dp[i][j] = 1;
                }else if(g ==1 ){
                    
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? 2: 1;
                    
                }else {
                    if(s.charAt(i) == s.charAt(j)){
                        
                    dp[i][j] =2+ dp[i+1][j-1];
                    }else{
                        
                    dp[i][j] =Math.max(dp[i][j-1],dp[i+1][j]);
                    }
                }
            
        }
        
        System.out.println(dp[0][n-1]);
    }

}