import java.io.*;
import java.util.*;

public class Main {

	public static int minScoreTriangulation(int[] arr) {
	    int n = arr.length;
		int dp[][] = new int[n][n];
		
		for(int g=0 ;g<n; g++){
		    for(int i =0,j=g; j< n; i++,j++){
		        if(g == 0){
		            dp[i][j] = 0;
		            
		        }else if (g==1){
		            dp[i][j] = 0;
		        }else if (g==2){
		            dp[i][j] = arr[i]*  arr[i+1]* arr[i+2];
		        }else{
		            int min = Integer.MAX_VALUE;
		            for(int k = i+1; k<j; k++){
		               int val = dp[i][k] +  dp[k][j] + (arr[i]*arr[j]*arr[k]);
		               if(val < min){
		                   min= val;
		               }
		            }
		            dp[i][j] = min;
		        }
		    }
		}
		return dp[0][n-1];
    }
  public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
		for(int i = 0 ; i  < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(minScoreTriangulation(arr));
	}
}