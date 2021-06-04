import java.io.*;
import java.util.*;

public class Main{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }
    
    // right lowest next element
    int []rb = new int[arr.length];
    Stack<Integer> st= new Stack();
    
    rb[arr.length-1]= arr.length;
    st.push(arr.length-1);
    
    for(int i = arr.length-2; i>= 0; i--)
    {
        while(st.size() > 0 && arr[i] <= arr[st.peek()]){
            st.pop();
        }
        if(st.size() == 0 ){
            rb[i] = arr.length;
        }else{
            rb[i]= st.peek();
        }
        st.push(i);
    }

    //left lowest next elemnt 
    
    
    
    int []lb = new int[arr.length];
    
    Stack<Integer> stl= new Stack();
    stl.push(0);
    lb[0]=-1;
    
    for(int i = 1 ; i< arr.length ; i++){
        while(stl.size() > 0 && arr[i] <= arr[stl.peek()]){
            stl.pop();
        }
            if(stl.size() == 0){
            lb [i] = -1;
        }else{
            lb[i]=stl.peek();
        }
        stl.push(i);
    }
    
    //   for(int i = 0  ; i< arr.length ; i++){
    //   System.out.println("lb: "+lb[i]+": rb: "+rb[i]);
    // }
    
    
    // calculate area of rectangle
    int max=0;
    for(int i= 0; i<arr.length; i++){
        
        int width= (rb[i]-lb[i])-1;
        
    //   System.out.println("arr[i] * width: "+arr[i] * width);
        max= (arr[i] * width)> max ? (arr[i]* width): max;
    }
    
    
    System.out.println(max);
    
 }
}











