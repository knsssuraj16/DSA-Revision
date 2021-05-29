import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p0 =1;
        int p1 =1;
        int c0=0;
        int c1=0;
        for(int i =2 ; i<= n; i++){
            c1 = p0+p1;
            c0 =p1;
            p1 =c1;
            p0 =c0;
        }
        long s= c1+c0;
        System.out.println(s*s);
 }

}