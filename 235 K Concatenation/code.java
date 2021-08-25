import java.io.*;
import java.util.*;

public class Main {

  public static long solution(int[] arr, int k, long sum) {
   
    int newArr[] = new int[arr.length*k];
    for(int i =0; i< arr.length*k; i++){
        newArr[i] = arr[i % arr.length];
    }
    int max=newArr[0];
    int Omax=newArr[0];
    for(int i =1; i< arr.length*k; i++){
       if(max <= 0){
           max = newArr[i];
       }else{
           max += newArr[i]; 
       }
       
       if(max> Omax){
           Omax=max;
       }
    }

    return Omax;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    long sum = 0;
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
      sum += arr[i];
    }
    int k = scn.nextInt();
    System.out.println(solution(arr, k, sum));
  }

}