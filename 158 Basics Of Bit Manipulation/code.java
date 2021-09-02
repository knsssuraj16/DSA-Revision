import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int i = scn.nextInt();
    int j = scn.nextInt();
    int k = scn.nextInt();
    int m = scn.nextInt();
    
    //write your code here
    
    int onMask= (1 << i);
    int offmask= ~(1 << j);
    int tog= (1 << k);
    int check= (1 << m);
    
    System.out.println(n | onMask);
    System.out.println(n & offmask);
    System.out.println(n ^ tog);
    System.out.println((n & check) == 0 ? false:true );
  }

}