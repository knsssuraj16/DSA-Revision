import java.io.*;
import java.util.*;

public class Main {
    
    public static boolean inChess(int n,int i, int j){
       
        
        if(i<0  || i>=n ||j<0  || j>=n){
            return false;
        }
       return true;
    }

	public static void solution(int r, int c, int n, int k) {
		double cdp[][]= new double[n][n];
		double ndp[][]= new double[n][n];
		cdp[r][c] =1;
		
		for(int ks =1; ks<=k;ks++){
		    
		   for(int i=0; i<n; i++){
		       for(int j =0; j<n ; j++){
		           if(cdp[i][j] > 0.0){
                    	if(inChess(n,i-2,j+1))	               
                    	ndp[i-2][j+1] += cdp[i][j]/8.0 ; 
                    	
                    	if(inChess(n,i-1,j+2)==true)
                    	ndp[i-1][j+2] +=  (cdp[i][j]/8.0); 
                    	
                    	if( inChess(n,i+1,j+2)==true)
                    	ndp[i+1][j+2] +=  (cdp[i][j]/8.0) ; 
                    	
                    	if(inChess(n,i+2,j+1)==true)
                    	ndp[i+2][j+1] +=   (cdp[i][j]/8.0) ; 
                    	
                    	if( inChess(n,i+1,j-2)==true)
                    	ndp[i+1][j-2] +=  (cdp[i][j]/8.0) ; 
                    	
                    	if(inChess(n,i+2,j-1)==true )
                    	ndp[i+2][j-1] +=  (cdp[i][j]/8.0) ; 
                    	
                    	if( inChess(n,i-1,j-2)==true )
                    	ndp[i-1][j-2] += (cdp[i][j]/8.0);
                    	
                    	if(inChess(n,i-2,j-1)==true)
                    	ndp[i-2][j-1] +=   (cdp[i][j]/8.0) ; 
		             
		           }
		       }
		   } 
		   
		   cdp = ndp;
		   ndp= new double[n][n];
		}
		
		double tot=0.0;
		for(int i=0; i< n; i++){
		    for(int j =0; j<n; j++){
		        tot +=cdp[i][j];
		    }
		}
		
		
		System.out.println(tot);
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		int r = scn.nextInt();
		int c = scn.nextInt();
		solution(r, c, n, k);
	}

}