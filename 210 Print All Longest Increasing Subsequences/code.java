import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    
    public static class Pair {
        int l;
        int i;
        int v;
        String psf;
        
        Pair(int l, int i, int v, String psf){
            this.l = l;
            this.i = i;
            this.v = v;
            this.psf = psf;
        }
    }
        
    public static void solution(int []arr){
        int n = arr.length;    
        int dp[]= new int[n];  
        int max=0;
        int maxi=-1;
        
        for(int i =0;  i< n; i++){
            int loc = 0;
            for(int j=0; j<i; j++){
                if(dp[j] > loc && arr[j] <= arr[i] ){
                    loc =  dp[j];
                }
            }
            
            dp[i]=  loc+1;
            
            if(dp[i] > max){
                max= dp[i];
                maxi=  i;
            }
        }
        System.out.println(max);
        
        ArrayDeque<Pair> q= new ArrayDeque();
        for(int i =0; i< n; i++){
           if(dp[i] == max){
            q.add(new Pair(max,i,arr[i],arr[i]+""));
            
           } 
        }
        
        while(q.size()> 0){
            Pair p = q.removeFirst();
            
                    // System.out.println("remo: "+p.v);
            if(p.l == 1){
                System.out.println(p.psf);
            }
            for(int i = p.i; i>=0; i--){
                    // if(p.v ==41)
                    // System.out.println("spe: "+arr[i]);
                if(dp[i] == (p.l-1) && arr[i] <= p.v){
                    
                    // System.out.println("add: "+arr[i]);
                 q.add(new Pair(dp[i],i,arr[i],arr[i]+" -> "+p.psf));
                }
            }
        }
        
    }
    
    
    
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }

        solution(arr);

        scn.close();
    }
}