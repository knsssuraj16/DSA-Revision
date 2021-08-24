import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String s2, String s1) {
		int dp[][] = new int [s1.length()+1][s2.length()+1];
		
		for(int i =0; i< dp.length; i++){
		    for(int j =0; j<dp[0].length; j++){
		        if(i ==0 && j ==0){
		          dp[i][j] = 0;
		        }else if(i==0){
		           dp[i][j]= (int)s2.charAt(j-1)+ dp[i][j-1];
		        }else if(j ==0){
		            
		           dp[i][j]= (int)s1.charAt(i-1)+ dp[i-1][j];
		        }else{
		            
		           int s2l= (int)s2.charAt(j-1);
		           
		           int s1l= (int)s1.charAt(i-1);
		           
		           if(s2.charAt(j-1) == s1.charAt(i-1)){
		                 dp[i][j] = dp[i-1][j-1];
		           }else{
		               if(dp[i][j-1]+ s2l > dp[i-1][j]+s1l ){
		                  dp[i][j] =  dp[i-1][j]+s1l;
		               }else{
		                 dp[i][j] =dp[i][j-1]+ s2l;
		               }
		           }
		        }
		    }
		}
		
// 		for(int i =0; i< dp.length; i++){
// 		    for(int j =0; j<dp[0].length; j++){
// 		      System.out.print(dp[i][j]+" ");
// 		    }
		    
// 		      System.out.println();
// 		}
		
		

		return dp[s1.length()][s2.length()];
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1, s2));
	}

}