import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ; i < n; i++){
      arr[i] = scn.nextInt();
    }
    solution(arr);
  }

  public static void solution(int[] arr){
   
   int res=0;
   
   for(int i = 0 ; i < arr.length; i++){
         res  = (res ^arr[i]);
      
    }for(int i = 1 ; i <= arr.length; i++){
         res  = (res ^i);
      
    }
    
    int mask= (res & (-res));
    int x=0;
    int y=0;
    for(int i = 0 ; i < arr.length; i++){
        if((arr[i] & mask) == 0){
            x = x^arr[i];
        }else{
             y = y^arr[i];
        }
      
    }for(int i = 1 ; i <= arr.length; i++){
         if((i & mask) == 0){
            x = x^i;
        }else{
             y = y^i;
        }
      
    }
    
     for(int i = 0 ; i < arr.length; i++){
        if(arr[i] == x){
        System.out.println("Missing Number -> "+y);
        System.out.println("Repeating Number -> "+x);
        break;
        }else if(arr[i] == y) {
          
        System.out.println("Missing Number -> "+x);
        System.out.println("Repeating Number -> "+y);
        break;
        }
      
    }
   
  }

}