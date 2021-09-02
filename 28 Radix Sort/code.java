import java.io.*;
import java.util.*;

public class Main {

  public static void radixSort(int[] arr) {
      int max= Integer.MIN_VALUE;
      for(int a: arr){
          max= Math.max(a,max);
      }
      
      int expo = 1;
      while(expo <= max){
          countSort(arr,expo);
         expo = expo * 10;
      }
  }

  public static void countSort(int[] arr, int exp) {
   int range = 10;
   int []indexArr= new int[range];
   for(int  i = 0; i<arr.length ; i++){
      int in =(arr[i]/ exp) % 10;
      indexArr[in]++;
   }
   
    int []revArr= new int[arr.length];
   for(int i =1 ; i<range ;i++){
       indexArr[i]=indexArr[i]+indexArr[i-1];
   }
   
    for(int i =arr.length-1; i>=0; i--){
       int ci= indexArr[(arr[i] / exp) % 10];
       revArr[ci-1] = arr[i];
       indexArr[(arr[i] / exp) % 10]--;
   }
   
    for(int  i = 0; i<arr.length ; i++){
      arr[i]= revArr[i];
   }
   
   
    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}