import java.io.*;
import java.util.*;

public class Main {

    public static int solution(int[] arr){
        int res=0;
      for(int i = 0 ; i < arr.length; i++){
            res =(res ^ (2  * arr[i]));
        }
       
       return res;
    }
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }
    
    
}