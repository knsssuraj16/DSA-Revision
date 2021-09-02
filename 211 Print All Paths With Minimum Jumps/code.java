import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    
    public static class Pair{
        int i;
        int s;
        int j;
        String psf;
        
        Pair(int i, int s,int j,String psf){
            this.i= i;
            this.s = s;
            this.psf= psf;
            this.j = j;
        }
    }
    
    
    public static void Solution(int arr[]){
       int n  = arr.length;
       Integer dp[]= new Integer[n];
       dp[n-1] =0;
       for(int i =  n-2; i>=0; i--){
           
           int min = Integer.MAX_VALUE;
           int steps= arr[i];
           for(int j=1; j <= steps && i+j < n; j++){
               
               if(dp[i+j] != null && dp[i+j]< min){
                   min = dp[i+j];
               }
               
              
           }
           if(min != Integer.MAX_VALUE){
                 dp[i]= min+1;
            }
           
       }
       System.out.println(dp[0]);
       
       ArrayDeque<Pair> q= new ArrayDeque();
       
       q.add(new Pair(0, arr[0],dp[0], "0"));
       
       while(q.size()> 0){
           Pair p  = q.removeFirst();
           if(p.j == 0){
               System.out.println(p.psf+" .");
           }
           
           for(int i = 1; i <= p.s && p.i+i < n; i++){
               int id= p.i+i;
               if(dp[id] != null && dp[id] == (p.j)-1){
                   
                q.add(new Pair(id, arr[id],dp[id],p.psf+" -> "+id));
               }
           }
           
           
       }
       
    }
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++)
            arr[i] = scn.nextInt();

        Solution(arr);
        scn.close();
    }
}
