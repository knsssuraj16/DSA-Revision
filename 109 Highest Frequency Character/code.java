import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        HashMap<Character, Integer> has= new HashMap();
        
        for(int  i =0;  i<s.length(); i++){
            char c=s.charAt(i);
            if(has.containsKey(c)){
               int a = has.get(c);
               a++;
               has.put(c,a);
            }else{
                
               has.put(c,1);
            }
            
        }
        
        int max=has.get(s.charAt(0));
        char maxC=s.charAt(0);
        for(Character c: has.keySet()){
           
            if(max < has.get(c)){
                max = has.get(c);
                maxC= c;
            }
        }
        
        System.out.println(maxC);
        
        
        
    }

}