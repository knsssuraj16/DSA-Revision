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
      res = res ^ arr[i];
    }
    int mask = (res & (-res));
   int num1=0;
   int num2=0;
   for(int i = 0 ; i < arr.length; i++){
        if((arr[i] & mask) ==0){
            num1= (num1 ^ arr[i] );
        }else{
             num2= (num2 ^ arr[i] );
        }
    }
    if(num1 > num2){
        System.out.println(num2);
        System.out.println(num1);
        
    }
    else{
        System.out.println(num1);
        
        System.out.println(num2);
        
    }
  }

}