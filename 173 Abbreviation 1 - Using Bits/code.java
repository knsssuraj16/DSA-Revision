import java.io.*;
import java.util.*;

public class Main {

    
    public static void solve(String str){
        
        for(int i =0 ; i< (1 << str.length()); i++){
            int count=0;
            StringBuilder s= new StringBuilder();
          
           for(int j = 0; j < str.length();j++){
               
                char c= str.charAt(j);
               int b = str.length() -1 -j;
               if((i & (1 << b)) == 0){
                   if(count == 0){
                       s.append(c);
                   }else{
                       s.append(count);
                       s.append(c);
                       count=0;
                   }
               }else{
                   count ++;
               }
               
               
             
           }
            if(count > 0){
                  s.append(count);
              } 
               
           
           System.out.println(s);
        }
        
    }
    
	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        solve(str);
    }
}