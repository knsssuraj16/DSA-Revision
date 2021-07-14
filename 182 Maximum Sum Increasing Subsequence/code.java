import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan =new  Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int [n];
        for(int i =0 ; i< n ;i++){
            arr[i]= scan.nextInt();
        }
        int max =0;
        int []dp= new int[n];
      
         for(int i =0 ; i< n ;i++){
             int temp =0;
           for(int j =0 ; j < i; j++){
               if(arr[i] >= arr[j] && dp[j] > temp){
                   temp = dp[j];
               }
           }
           dp[i]= temp+arr[i];
           if(dp[i] > max){
               max = dp[i];
           }
        }
        
        System.out.println(max);
    }

}