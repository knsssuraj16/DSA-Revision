import java.io.*;
import java.util.*;

public class Main {
    public static long ncr(long n, long r){
        if(n < r){
            return 0L;    
        }
        
        long res = 1L;
        
        for(long i = 0L; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        
        return res;
    }
    
    public static long solution(long n, int k, int i) {
      long res = 0;
      if( i== 0){
          return 0;
      }
      
      long mask =  1L << i;
      if((n & mask) == 0){
        res = solution(n, k, i-1);
      }else{
          long res2 =  solution(n, k-1, i-1); 
          long res1 =  ncr(i,k);
          res =res2+res1;
      }
      
      return res;
    }
    
    public static int csb(long n){
        int res = 0;
        
        while(n > 0){
            long rsb = n & -n;
            n -= rsb;
            res++;
        }
        
        return res;
    }
    
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        int k = csb(n);
        System.out.println(solution(n, k, 63));
    }
	
	
}