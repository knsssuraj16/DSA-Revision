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
        int buy=arr[0];
        int sell=arr[0];
        int maxPro=0;
        for(int i =1 ; i<n ; i++){
            if(arr[i] >= arr[i-1]){
                sell = arr[i];
                
            } 
            if (arr[i] < arr[i-1] || i == (n-1)){
                 maxPro += sell - buy; 
                 sell = arr[i];
                 buy = arr[i];
            }   
            
        }   System.out.println(maxPro);
    }

}