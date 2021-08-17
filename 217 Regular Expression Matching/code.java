import java.io.*;
import java.util.*;

public class Main {

	public static boolean solution(String s, String p) {
		
		boolean dp[][] = new boolean [p.length()+1][s.length()+1];
		
		for(int i =0; i<= p.length(); i++){
		    for(int j=0; j<= s.length(); j++){
		        if(i==0 && j == 0){
		            dp[i][j]= true;
		        }else if(i == 0){
		            dp[i][j]= false;
		        }else if (j == 0){
		            if(p.charAt(i-1) == '*'){
		                
		            dp[i][j]= dp[i-2][j];
		            }else{
		                dp[i][j] = false;
		            }
		        }else{
		            if(p.charAt(i-1)=='.' ||p.charAt(i-1)== s.charAt(j-1) ){
		                
		                dp[i][j] = dp[i-1][j-1];
		            }else if (p.charAt(i-1) == '*'){
		                if(dp[i-2][j]){
        		             dp[i][j]= true;
		                }else{
		                    if(p.charAt(i-2) == s.charAt(j-1) ||  p.charAt(i-2) == '.'){
		                      dp[i][j]=   dp[i][j-1];
		                    }else{
		                        dp[i][j]= false;
		                    }
		                }
		            }else {
		                 dp[i][j] = false;
		            }
		        }
		    }
		}
		
		
				
// 		for(int i =0; i<= p.length(); i++){
// 		    for(int j=0; j<= s.length(); j++){
// 		    System.out.print(dp[i][j]+" ");     
// 		   }
		
// 		    System.out.println();
// 		}
		
		return dp[p.length()][s.length()];
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.next();
		String s2 = scn.next();
		System.out.println(solution(s1,s2));
	}

}