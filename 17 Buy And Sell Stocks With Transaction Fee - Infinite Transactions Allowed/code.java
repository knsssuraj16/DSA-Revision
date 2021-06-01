import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []arr= new int [n];
        
        
        for(int i =0 ; i<n ; i++){
            arr[i]= scan.nextInt();
        }
        
        int tnx  = scan.nextInt();

        
        int bsp= -arr[0];
        int ssp=0;
        
        for(int i =1 ; i<n ; i++){
         if((  ssp - arr[i]) > bsp){
             bsp =ssp - arr[i];
         }
         if(((arr[i] + bsp) - tnx) >ssp){
            ssp = ((arr[i] + bsp) - tnx);
         }
        }   
        //   maxPro-=tax;
          System.out.println(ssp);
    }

}