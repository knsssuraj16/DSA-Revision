import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();
    int left = scn.nextInt();
    int right = scn.nextInt();

   int mask1= 1 << (right-left +1);
   mask1= mask1 - 1;
   mask1= mask1 <<(left-1);
   
   int mask2 = (a & mask1);
    System.out.println(b | mask2);
  }

}