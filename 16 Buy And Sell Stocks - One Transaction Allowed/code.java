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
        int []pist= new int [n];
        int low=arr[0];
        int max=arr[0];
        int maxPro=0;
        for(int i =1 ; i<n ; i++){
            if(arr[i] <low){
                
                low = arr[i];
                max = arr[i];
                
            } if (arr[i] > max){
                max= arr[i];
                
            }   
                pist[i]= max-low;
                maxPro =  pist[i] >maxPro ? pist[i] : maxPro;
            
        }   System.out.println(maxPro);
    }

}