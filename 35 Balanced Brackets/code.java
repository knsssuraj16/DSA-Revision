import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
      Scanner scan = new Scanner(System.in);
       String str=  scan.nextLine();
        boolean checck =true;
        Stack<Character> st= new Stack<>();
        for(int i= 0 ; i < str.length(); i++){
            char c= str.charAt(i);
           if (c == ')' || c=='}' || c==']'){
               if(st.size() == 0){
                   
               System.out.println(false);
               return;
               }
               if(st.peek() == '(' && c != ')' ){
               System.out.println(false);
               return;
               }else if(st.peek() == '{' && c != '}' ){
               System.out.println(false);
               return;
               }else if(st.peek() == '[' && c != ']'){
               System.out.println(false);
               return;
               }
               
               st.pop();
            }else if (c == '(' || c=='{' || c=='['){
                st.push(c);
            } 
        }
            if(st.size() != 0){
                checck = false;
            }
            System.out.println(checck);
    }

}