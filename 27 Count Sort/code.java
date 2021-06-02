import java.io.*;
import java.util.*;

public class Main {

  public static void countSort(int[] arr, int min, int max) {
   int range = max - min+1;
   int []indexArr= new int[range];
   for(int  i = 0; i<arr.length ; i++){
      int in =arr[i]-min;
      indexArr[in]++;
   }
   int []revArr= new int[arr.length];
   for(int i =1 ; i<range ;i++){
       indexArr[i]=indexArr[i]+indexArr[i-1];
   }
   
   for(int i =arr.length-1; i>=0; i--){
       int ci= indexArr[arr[i] - min];
       revArr[ci-1] = arr[i];
       indexArr[arr[i] - min]--;
   }
   
    for(int  i = 0; i<arr.length ; i++){
      arr[i]= revArr[i];
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}