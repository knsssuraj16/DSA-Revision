import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
  Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int []arr= new int[n];
        for(int i =0 ; i< n ; i++){
            arr[i]= scan.nextInt();
        }
        
        int tar= scan.nextInt();
        int []dp= new int [tar+1];
        dp[0]= 1;
        
       for(int j =1; j<dp.length; j++){
             for(int  i= 0; i< n ; i++){
                 if(j-arr[i]>= 0)
                dp[j] +=dp[j-arr[i]];
            }
        }
    System.out.println(dp[tar]);
    }
}