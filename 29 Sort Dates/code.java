import java.io.*;
import java.util.*;

public class Main {

  public static void sortDates(String[] arr) {
    countSort(arr,1000000,100,32);
    countSort(arr,10000,100,13);
    countSort(arr,1,10000,2501);
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    
   int []indexArr= new int[range];
   for(int  i = 0; i<arr.length ; i++){
      int in =(Integer.parseInt(arr[i],10)/ div) % mod;
      indexArr[in]++;
   }
   
    String []revArr= new String[arr.length];
   for(int i =1 ; i<range ;i++){
       indexArr[i]=indexArr[i]+indexArr[i-1];
   }
   
    for(int i =arr.length-1; i>=0; i--){
       int ci= indexArr[(Integer.parseInt(arr[i],10)/ div) % mod];
       revArr[ci-1] = arr[i];
       indexArr[(Integer.parseInt(arr[i],10)/ div) % mod]--;
   }
   
    for(int  i = 0; i<arr.length ; i++){
      arr[i]= revArr[i];
   }
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}