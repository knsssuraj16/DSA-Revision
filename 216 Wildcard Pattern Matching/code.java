import java.io.*;
import java.util.*;

public class Main {

	public static boolean solution(String str, String p) {
		
		boolean dp[][]= new boolean [p.length()+1][str.length()+1];
		
		for(int i = p.length() ; i>= 0 ; i-- ){
		    	for(int j = str.length() ; j>= 0 ; j-- ){
		    	    
		            if( i == p.length() && j == str.length() ){
		                dp[i][j] =  true;
		                
		            }else if(i == p.length()){
		                dp[i][j] =  false;
		                
		            }else if( j == str.length()){
		                if(p.charAt(i) == '*'){
    		                dp[i][j] =  dp[i+1][j];
		                }else{
		                     dp[i][j] = false;
		                }
		            }else{
		                if(p.charAt(i) == '*'){
		                    
		                    dp[i][j]= dp[i+1][j] || dp[i][j+1];
		                    
		                }else if (p.charAt(i)  == '?'){
		                     dp[i][j] =dp[i+1][j+1];
		                }else if (p.charAt(i) == str.charAt(j)){
		                    dp[i][j] =dp[i+1][j+1];
		                }else{
		                    dp[i][j] = false;
		                }
		            }
		        }
		}
		
		return dp[0][0];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}