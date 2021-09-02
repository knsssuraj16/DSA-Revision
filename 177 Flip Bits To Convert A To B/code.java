import java.io.*;
import java.util.*;

public class Main {

    public static int countSetBit(int a){
        int count =0;
        while(a > 0){
        int ra= (a & -a);
        a= a-ra;
        count++;
        }
        return count;
    }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
    int b = scn.nextInt();

    int res = (a ^ b);
    System.out.println(countSetBit(res));
  }

}