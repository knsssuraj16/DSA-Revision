import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
   Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int [][]arr= new int [n][k];
        long [][]dp= new long [n][k];
        for(int i = 0 ; i< n; i++){
            for(int j =0 ; j< k ;j++){
                  arr[i][j] = scan.nextInt();
            }
        }
        
        
         for(int i = 0 ; i< n; i++){
                   for(int j =0 ; j< k ;j++)
                   {
                    
                    if(i == 0){
                        dp[i][j]=arr[i][j];
                    }else {
                        long min= Integer.MAX_VALUE;
                        for(int z =0; z< k ; z++){
                            if(z != j){
                              min =  Math.min( min, dp[i-1][z]);
                            }
                        }
                    dp[i][j] = arr[i][j]+min;
                    
                    }
                    
                   }
        }
        
         
                        long min =Integer.MAX_VALUE;
                        for(int z =0; z< k ; z++){
                            
                              min =  Math.min( min, dp[n-1][z]);
                            
                        }
                    
        
        
         System.out.println(min);
    }
}