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
        int max = 1;
        int []dp= new int[n];
        dp[0] = 1;
         for(int i =1 ; i< n ;i++){
             int temp =0;
           for(int j =i-1 ; j >=0; j--){
               if(arr[i] > arr[j] && dp[j] > temp){
                   temp = dp[j];
               }
           }
           dp[i]= temp+1;
           if(dp[i] > max){
               max = dp[i];
           }
        }
        
        System.out.println(max);
    }

}