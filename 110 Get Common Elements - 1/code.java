import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(System.in);
    int n =scan.nextInt();
    
    HashMap<Integer,Integer> n1= new HashMap();
    
    
    for(int i =0 ; i< n; i++){
        int a = scan.nextInt();
        n1.put(a,1);
    }
    
    int m = scan.nextInt();
    
     
    int [] m1= new int[m];
    
    
    for(int i =0 ; i< m; i++){
        int a = scan.nextInt();
        m1[i]=a;
    }
    
    for(int a: m1){
        if(n1.containsKey(a)){
            System.out.println(a);
            n1.remove(a);
        }
    }
    
    
    
 }

}