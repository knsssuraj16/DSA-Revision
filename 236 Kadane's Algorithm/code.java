import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int[] arr) {
   
   int dp[]= new int [arr.length];
   
   dp[0] = arr[0];
   int Omax = Integer.MIN_VALUE;
   int max = arr[0];
   for(int i =1; i<arr.length; i++){
        
        if (max >= 0){
        max += arr[i];
        }else {
             max= arr[i];
        }
        if(max > Omax){
            Omax = max;
        }
        
   }

    return Omax;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    System.out.println(solution(arr));
  }
}