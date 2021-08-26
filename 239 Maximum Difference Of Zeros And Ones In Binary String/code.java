import java.io.*;
import java.util.*;

public class Main {

	public static int solution(String str) {
		
// 		int dp []= new int[str.length]
int max=-1;
int loc = 0;
		for(int i =0; i<str.length(); i++){
		    char c=str.charAt(i);
		     
		    if(c == '0'){
		        if(loc <= 0){
		            loc =1;
		        }else{
		            loc++;
		        }
		    }else {
		        loc--;
		    }
		    if(loc > max){
		        max = loc;
		    }
		}

		return max;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}