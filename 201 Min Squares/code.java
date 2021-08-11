import java.io.*;
import java.util.*;

public class Main {

	public static int solution(int n){
	
	    int []dp= new int[n+1];
	    
	    dp[0]=0;
	   
	    for(int i =1; i<=n; i++){
	        int cou=Integer.MAX_VALUE;
	        for(int j =1 ; j<=n; j++){
	            int pw= (int)Math.pow(j,2);
	            if(pw > i){
	                break;
	            }else{
	                int locI= i-pw;
	               // System.out.println(i+ " locu : "+locI);
	             
	                     cou =Math.min(dp[locI],cou);
	                
	                
	            }
	        }
	        
	        dp[i]= cou+1;
	        
	        
	    }

		return dp[n];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(solution(n));
	}


	
}