import java.io.*;
import java.util.*;

public class Main {

  public static int solution(int[] arr, int k) {
    int sum =Integer.MIN_VALUE;
    int n = arr.length;
    int dp[] = new int[arr.length];
    
    int csum = arr[0];
    dp[0] = csum;
    for(int i =1;i< n ; i++)
    {
        if(csum <= 0){
            csum = arr[i];
        }else{
            csum += arr[i];
            
        }   
        dp[i] = csum;
    }
    
    int exk = 0;
    for(int i =0; i<k ;i++){
        exk += arr[i];
    }
    if(exk > sum){
        sum = exk;
    }
    
    for(int i = k; i< n ;i++){
        exk = exk+ arr[i] - arr[i-k];
       if(exk > sum){
        sum = exk;
         }
         int atlek = exk + dp[i-k];
         if(atlek > sum){
            sum = atlek;
         }
         
         
    }
    
    return sum;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }
    int k = scn.nextInt();
    System.out.println(solution(arr, k));
  }
}