import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        int cel= -1;
        Stack <Integer>st= new Stack();
        st.push(0);
       for(int i = 1 ; i<arr.length; i++){
           if(st.size() >0 &&  arr[st.peek()][i] == 1 ){
              
                  st.pop(); 
               
           }
           st.push(i);
       }
       
       while(st.size() >1){
           int i = st.pop();
           int j = st.pop();
          if( arr[i][j] == 1 ){
              st.push(j);
           } else  {
              st.push(i);
           }
       }
       int pot= st.pop();
       for(int i = 0 ; i< arr.length ; i++){
           if (i != pot){
           if(arr[i][pot] ==0 || arr[pot][i] == 1){
               
           System.out.println("none");
           return;
           }
           }
       }
       
           System.out.println(pot);
      
    }

}