import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    
    int evMask= 0xAAAAAAAA;
    int oddMask=0x55555555;
    
    int even = (evMask & n);
    int odd=  (oddMask &n);
    
    even >>= 1;
    odd <<=1;
    System.out.println(even | odd);
    
  }

}