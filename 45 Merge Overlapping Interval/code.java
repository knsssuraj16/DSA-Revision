import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        Pair [] pairs= new Pair[arr.length];
        for(int i = 0; i< arr.length; i++){
            Pair pair= new Pair(arr[i][0],arr[i][1]);
            pairs[i]= pair;
        }
        
        Arrays.sort(pairs);
        Stack <Pair> st = new Stack();
        st.push(pairs[0]);
         for(int i = 1; i< arr.length; i++){
            Pair pair= st.peek();
            if(pair.et >= pairs[i].st){
                int max = Integer.max(pair.et,pairs[i].et);
                pair.et= max;
                st.pop();
                st.push(pair);
            }else {
                st.push(pairs[i]);
            }
        
        }
        Stack <Pair>res= new Stack();
        while(st.size()> 0 ){
            Pair pair= st.pop();
            res.push(pair);
        }
        while(res.size()> 0 ){
            Pair pair= res.pop();
            System.out.println(pair.st+" "+pair.et);
        }
    
    }
    
   public static class Pair implements Comparable<Pair>{
        int st;
        int et;
        Pair(int st, int et){
            this.st= st;
            this.et = et;
        }
        
        public int compareTo(Pair other){
            if(this.st  != other.st){
                return this.st - other.st;
            }else {
                return this.et - other.et;
            }
        }
    }
    
    
    
    
    

}