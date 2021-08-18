import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
  Scanner scan= new Scanner(System.in);
  int n = scan.nextInt();
  
  int dp[]= new int [n+1];
  dp[0]=1;
  dp[1]=1;
  for(int i =2; i<= n;i++){
     int j=0;
     int k =i-1;
     while(k>=0){
         
         
         dp[i]+=dp[j]*dp[k];
         k--;
         j++;
     }
  }
  
  
  
  System.out.println(dp[n]);
    }

}





















