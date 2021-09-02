import java.io.*;
import java.util.*;

public class Main {
    
    public static class Bridge implements Comparable<Bridge>{
        int n;
        int s;
         Bridge(int n,int s){
             this.n=n;
             this.s= s;
         }
         public int compareTo(Bridge o){
             if(this.n!= o.n)
             return this.n- o.n;
             else{
                 
             return this.s- o.s;
             }
             
         }
    }

    public static void main(String[] args) throws Exception {
      int n ;
      Scanner scan = new Scanner(System.in);
      n= Integer.parseInt(scan.nextLine());
      
      Bridge []b= new Bridge[n];
      for(int i =0; i<n ;i++){
         String s[]= scan.nextLine().split(" ");
         int nr = Integer.parseInt(s[0]);
         int st = Integer.parseInt(s[1]);
         b[i]= new Bridge(nr,st);
         
      }
      Arrays.sort(b);
      
        
    int res=0;
    int []dp=new int[n];
    
    for(int i =0; i< n; i++){
        int max=0;
        for(int j =0; j< i ; j++){
            if(b[i].s >= b[j].s){
                max = Math.max(max,dp[j]);
            }
            
        }
        dp[i]=max+1;
        res=Math.max(res,dp[i]);
        
        
    }
    
    System.out.println(res);
      
      
      
      
    }
    
    
    
    
    
    
    
    

}