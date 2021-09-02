import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
       String str=  scan.nextLine();
        boolean checck =false;
        Stack<Character> st= new Stack<>();
        for(int i= 0 ; i < str.length(); i++){
            char c= str.charAt(i);
           if (c == ')'){
               
               if(st.peek() == '('){
               System.out.println(true);
               return;
               }
               
               while(st.peek() != '(')
               {
                   st.pop();
                   
               }
               st.pop();
            }else {
                st.push(c);
            } 
        }
         
            System.out.println(checck);
        
    }

}