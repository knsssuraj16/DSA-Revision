import java.io.*;
import java.util.*;

public class Main {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      
      PriorityQueue<Integer> p= new PriorityQueue();
      for (int i = 0; i < n; i++) {
         if(p.size() <= k){
             p.add(arr[i]);
         }else{
            int sma=  p.peek();
            arr[i-(k+1)]= sma;
            p.remove();
            p.add(arr[i]);
         }
      }
      
      while(k >=0){
          int sma=  p.peek();
            arr[arr.length-(k+1)]= sma;
            p.remove();
            k--;
      }
      
      for (int i = 0; i < n; i++) {
         System.out.println(arr[i]);
      }
   }

}