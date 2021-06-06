import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String str = br.readLine();

    Stack<Integer> sti= new Stack();
    int l =1;
    
    for(int i =0;  i<  str.length(); i++){
        if( str.charAt(i) == 'i'){
            sti.push(l++);
            
            while(sti.size() > 0 ){
                System.out.print(sti.pop());
            }
        }else{
        sti.push(l++);
        }
    }
    
            sti.push(l++);
    
     while(sti.size()> 0){
         
                System.out.print(sti.pop());
            }
    
 }
}