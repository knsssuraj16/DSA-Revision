import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String str){
		int n = str.length()+1;
		int dp[][]= new int [n][n];
		for (int i =0; i<n; i++){
		    for(int j =0; j<n ;j++){
		        if(i ==0 || j == 0){
		            dp[i][j]= 0;
		        }else if (i != j && str.charAt(i-1) == str.charAt(j-1)){
		            dp[i][j]= dp[i-1][j-1]+1;
		            
		        }else{
		             dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]) ;
		        }
		    }
		}

		return dp[n-1][n-1];
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}