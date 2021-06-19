import java.io.*;
import java.util.*;

public class Main {
    

    public static class Pair implements Comparable<Pair>{
        int val;
        int qua;
        double up;
        Pair(int val, int qua, double up){
            this.val= val;
            this.qua=qua;
            this.up = up;
        }
        
        public int compareTo(Pair o){
            return (int)(this.up*100-o.up*100);
        }
    }     
    public static void main(String[] args) throws Exception {
        
     Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int []val= new int[n];
        for(int i =0 ; i< n ; i++){
            val[i]= scan.nextInt();
        }
        int []wei= new int[n];
        for(int i =0 ; i< n ; i++){
            wei[i]= scan.nextInt();
        }
        
        int cap= scan.nextInt();
        double res=0;
        PriorityQueue<Pair> pq= new PriorityQueue(Collections.reverseOrder());
        
        for(int i =0 ; i< n ; i++){
            Pair p = new Pair(val[i],wei[i],(double )val[i]/(double)wei[i]);
            pq.add(p);
        }
    
        while(pq.size()>0){
            Pair p = pq.remove();
            
            
            //  System.out.println(p.val);
            //  System.out.println(p.qua);
            //  System.out.println(p.up);
            if(p.qua >= cap){
               res+= (double) cap* (double) p.up;
               break;
            }else{
               res+=(double) p.qua* (double) p.up;
               cap = cap-p.qua;
                
            }
        }
        
         System.out.println(res);
            
        }
    
}