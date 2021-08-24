import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String s1, String s2, int c1, int c2) {
			int dp[][] = new int [s1.length()+1][s2.length()+1];
		
		for(int i =0; i< dp.length; i++){
		    for(int j =0; j<dp[0].length; j++){
		        if(i ==0 && j ==0){
		          dp[i][j] = 0;
		        }else if(i==0){
		           dp[i][j]= c2+ dp[i][j-1];
		        }else if(j ==0){
		            
		           dp[i][j]= c1+ dp[i-1][j];
		        }else{
		            
		           int s2l= c2;
		           
		           int s1l= c1;
		           
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
		

		
		

		return dp[s1.length()][s2.length()];
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		int x = scn.nextInt();
		int y = scn.nextInt();
		System.out.println(solution(s1, s2,x, y));
	}

}