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
      
      PriorityQueue p= new PriorityQueue();
      for (int i = 0; i < n; i++) {
          if( i > k-1){
             p.add(arr[i]);
             p.remove();
          }else{
              
             p.add(arr[i]);}
      }
      
      while(k != 0){
          
      System.out.println(p.peek());
         p.remove();
         k--;
         
      }
      
    }

}