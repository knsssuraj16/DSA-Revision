import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String str) {
		
		int n = str.length();
		
		int next[]= new int[n];
		
		int prev[]= new int[n];
		
		HashMap <Character, Integer> map = new HashMap();
		for(int i =0; i< n; i++){
		    char c = str.charAt(i);
		    int id;
		    if(map.containsKey(c)){
		        id = map.get(c);
		        prev[i]= id;
		        
		    }else{
		        prev[i]=-1;
		    }
		    
		    map.put(c,i);
		}
		map.clear();
		for(int i =(n-1); i>=0; i--){
		    char c = str.charAt(i);
		    int id;
		    if(map.containsKey(c)){
		        id = map.get(c);
		        next[i]= id;
		        
		    }else{
		        next[i]=-1;
		    }
		    
		    map.put(c,i);
		}
		
		int dp[][]= new int[n][n];
		
		for(int g=0; g< n; g++){
		    for(int i =0, j=g; j<n; j++,i++){
		        if(g==0){
		            dp[i][j] = 1;
		        }else if(g==1){
		            dp[i][j] = 2; 
		        }else{
		            char f= str.charAt(i);
		            char l= str.charAt(j);
		            if(f != l){
		                
		                dp[i][j] = dp[i+1][j]+dp[i][j-1]- dp[i+1][j-1];
		                
		            }else{
		                int ne= next[i];
		                int p= prev[j];
		                
		                if(ne > p){
		                        
		                dp[i][j] = 2*dp[i+1][j-1]+2;
		            
		                }else if(ne==p){
		                    
		                dp[i][j] = 2*dp[i+1][j-1]+1;
		                }else{
		                    
		                dp[i][j] = 2*dp[i+1][j-1]- dp[ne+1][p-1];
		                }
		            }
		        }
		    }
		}
		
		
		
		return dp[0][n-1];
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}