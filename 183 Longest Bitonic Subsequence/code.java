import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int arr[]= new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        
        int []dp= new int[n];
        int []rdp= new int[n];
        
         for(int i =0 ; i< n ;i++){
             int temp =0;
           for(int j =0 ; j <i; j++){
               if(arr[i] >= arr[j] && dp[j] > temp){
                   temp = dp[j];
               }
           }
           dp[i]= temp+1;
          
        } 
        
        for(int i =n-1 ; i>=0 ;i--){
             int temp =0;
           for(int j = n-1 ; j > i; j--){
               if(arr[i]>= arr[j] && rdp[j] > temp){
                   temp = rdp[j];
               }
           }
           rdp[i]= temp+1;
          
        }
        int max= dp[0]+rdp[0]-1;
        
        for(int i=0; i<n; i++){
          int temp = dp[i]+rdp[i]-1;
          if(temp > max){
              max= temp;
          }
        }
        
        
        System.out.println(max);
        
    }

}