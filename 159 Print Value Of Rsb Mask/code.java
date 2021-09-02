import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int res= (n & (~n + 1));
    System.out.println( Integer.toBinaryString(res));
    
  }

}