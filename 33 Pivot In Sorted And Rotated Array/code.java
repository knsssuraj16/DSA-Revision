import java.io.*;
import java.util.*;

public class Main {

  public static int findPivot(int[] arr) {
   int l = 0;
   int h =arr.length-1;
   while(l< h){
       int mid = (l+h)/2;
       if(arr[mid] > arr[h]){
           l = mid+1;
       }else {
           h = mid;
       }
   }
   return arr[h];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }

}