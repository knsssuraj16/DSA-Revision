import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr= new int[n];
        for(int i = 0 ; i< n ; i++){
            
        arr[i] = scan.nextInt();
        }


        int inc =arr[0];
        int ex= 0;
        int cin= 0;
        int cex= 0;
        for(int i = 1 ; i< n ; i++){
            
            cin =ex + arr[i];
            cex= Math.max(inc,ex); 
            
            ex=cex;
            inc = cin;
        
        }
        
        System.out.println(Math.max(ex,inc));
    }
}