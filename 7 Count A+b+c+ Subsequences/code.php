import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
        String  s = scan.nextLine();
        
        int [][] dp= new int[3][s.length()+1];
        
        for(int j = 0 ; j<= s.length(); j++)
        {
            for(int i = 0 ; i< 3; i++){
                if(j ==  0){
                    dp[i][j] = 0 ;
                }
                else{
                    if(s.charAt(j-1) == 'a' && i == 0){
                        dp[i][j]= (2*dp[i][j-1])+1;
                        
                    } else if(s.charAt(j-1) == 'b'&& i == 1){
                        dp[i][j]= (2*dp[i][j-1])+dp[i-1][j-1];
                    } else if(s.charAt(j-1) == 'c' && i == 2){
                        dp[i][j]= (2*dp[i][j-1])+dp[i-1][j-1];
                    }else{
                        dp[i][j]= dp[i][j-1];
                    }
                }
            }
        }
        
            // for(int i = 0 ; i< 3; i++){
            //   for(int j = 0 ; j<= s.length(); j++)
            // {
            //      System.out.print(dp[i][j]+ " ");
                
            // }
            // System.out.println();
            
            
                 System.out.print(dp[2][s.length()]);
        }
    
}