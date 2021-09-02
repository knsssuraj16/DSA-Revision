import java.io.*;
import java.util.*;

public class Main {

	public static int mcm(int[] arr){
	    int n= arr.length-1;
		int dp [][]= new int[n][n];
		
		for(int g =0; g < n; g++){
		    for(int i =0,j=g; j<n; j++,i++){
		        if(g ==0){
		            dp[i][j] = 0;
		            
		        }else if(g ==1){
		            dp[i][j] =  arr[i]*arr[j]*arr[(j+1)];
		        }else {
		            int min = Integer.MAX_VALUE;
		            for(int k = i; k< j ; k++){
		                int l1 = dp[i][k];
		                int r1 = dp[k+1][j];
		                int m1= arr[i]* arr[j+1]* arr[k+1];
		                int tc = l1+r1+m1;
		                
		               min= Math.min(tc,min);
		            }
		            
		        dp[i][j] =min;
		        }
		    }
		    
		}

		return 
		        dp[0][n-1] ;}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n; i++){
			arr[i] = scn.nextInt();
		}
		System.out.println(mcm(arr));
	}

	
}