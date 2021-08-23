import java.io.*;
import java.util.*;

public class Main {
  
  private static void optimalbst(int[] k, int[] f, int n) {
    int dp[][]= new int[n][n];
    
    for(int g =0; g< n; g++){
        for (int i =0,j=g; j<n; j++,i++){
            if(g==0){
                dp[i][j] = f[i];
            }else if(g ==1 ){
               dp[i][j] = Math.min((2*f[i]+f[j]),(f[i]+2*f[j]));
            }else {
                int min = Integer.MAX_VALUE;
                int fs = 0;
                   for(int z=i; z<=j; z++){
                    fs +=f[z];                   
                }
                for(int z=i; z<=j; z++){
                    
                    int l = z == i ? 0: dp[i][z-1];
                    int r = z == j ? 0: dp[z+1][j];
                    if(l+r+fs < min ){
                        min = l+r+fs;
                    }
                }
                
                dp[i][j] = min;
            }
        }
    }
    System.out.println(dp[0][n-1]);
    
	}

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
	int[] keys = new int[n];
	int[] frequency = new int[n];
    for(int i= 0 ;i < n ; i++) {
		keys[i] = scn.nextInt();
	}
	for(int i = 0 ; i < n; i++){
      frequency[i] = scn.nextInt();
    }
	optimalbst(keys,frequency,n);
	}

}