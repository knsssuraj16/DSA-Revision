import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int mask = (n &(n-1));
    if(mask == 0){
        System.out.println(true);;
    }else{
        System.out.println(false);
    }
    
  }

}   