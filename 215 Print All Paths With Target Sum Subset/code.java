import java.io.*;
import java.util.*;

public class Main {

    public static class Pair{
        int i;
        int j;
        String psf;

        public Pair(int i, int j, String psf){
            this.i = i;
            this.j = j;
            this.psf = psf;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tar = Integer.parseInt(br.readLine());

        boolean dp[][]= new boolean[n+1][tar+1];
        
        for(int i =0; i<= n; i++){
            for(int j=0; j<= tar; j++){
                if(j == 0){
                    dp[i][j] = true;
                }else if (i == 0){
                    dp[i][j] =false;
                }else{
                    dp[i][j] = dp[i-1][j];
                      int val = arr[i-1];
                        if(j >= val){
                            if(dp[i-1][j-val] == true){
                                dp[i][j]= true; 
                            }
                       
                    }  
                }
            }
        }
        
        System.out.println(dp[n][tar]);
        ArrayDeque<Pair> q= new ArrayDeque();
        
        q.add(new Pair(n,tar,""));
        
        while(q.size() > 0){
            Pair p = q.removeFirst();
            
            if(p.i == 0 || p.j == 0){
                System.out.println(p.psf);
            }else{
                
                int val = arr[p.i-1];
                boolean ex = dp[p.i-1][ p.j];
                 if(val <= p.j){
                    
                boolean inc = dp[p.i-1][p.j-val];
                if(inc){
                    q.add(new Pair(p.i-1,p.j-val,p.i-1+" "+p.psf));
                    }
                }
                if(ex){
                    
                    q.add(new Pair(p.i-1,p.j,p.psf));
                }
               
            }
        }
        

    }
}


                        


                        