import java.io.*;
import java.util.*;

public class Main {

	public static int minPalindromicCut(String s) {
	    int n = s.length();
	    boolean dp[][]= new boolean [n][n];
	    
	    for (int g=0; g<n ; g++){
	        for(int i=0, j=g; j<n; i++,j++){
	            if(g == 0){
	                dp[i][j] = true;
	            }else if (g==1){
	                dp[i][j]= s.charAt(i) == s.charAt(j);
	            }else{
	                dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
	            }
	        }
	    }
	    
	    int res[]= new int[n];
	    res[0] = 0;
	      for (int j=1; j<n ; j++){
	       if(dp[0][j]){
	           res[j] = 0;
	       }else{
	           int min = Integer.MAX_VALUE;
	           for(int i = n-1; i>=1; i--){
	              if(dp[i][j]){
	                  if(res[i-1] < min){
	                      min = res[i-1];
	                  }
	              }
	           }
	           res[j] = min+1;
	       }
	       //  System.out.println();
	    }

		return res[n-1];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		System.out.println(minPalindromicCut(str));
	}
}