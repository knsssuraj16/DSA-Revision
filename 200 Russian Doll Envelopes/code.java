import java.io.*;
import java.util.*;

public class Main {

    public static class Envolb implements Comparable<Envolb>{
        int l;
        int b;
        Envolb(int l, int b){
            this.l= l;
            this.b= b;
        }
        
        public int compareTo(Envolb o){
          
            return this.l-o.l;
           
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        int n= Integer.parseInt(scan.nextLine());
        
        Envolb [] env= new Envolb[n];
        for(int i = 0; i< n; i++){
            
            String [] a =scan.nextLine().split(" ");
            int l= Integer.parseInt(a[0]);
            int b= Integer.parseInt(a[1]);
            env[i]= new Envolb(l,b);
        }
        
        Arrays.sort(env);
        
        int dp[]= new int[n];
        int tot=0;
           for(int i = 0; i< n; i++){
            int max= 0;
            for(int j=0; j< i; j++){
                if(env[i].b > env[j].b && env[i].l > env[j].l){
                    max= Math.max(dp[j],max);
                }
            }
            
            dp [i] = max+1;
            tot = Math.max(tot,dp[i]);
        }
        
        System.out.println(tot);
    }

}