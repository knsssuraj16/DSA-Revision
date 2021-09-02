import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scan= new Scanner(System.in);
        String s = scan.nextLine();
        int n = s.length();
        boolean dp[][]=new boolean [n][n];
        int count=1;
        for(int g=0; g < n ; g++){
            for (int i=0,j =g; j<n; j++,i++ ){
                if(g == 0){
                    dp[i][j]= true;
                }else if (g == 1){
                    if(s.charAt(i) == s.charAt(j)){
                      dp[i][j] = true; 
                       count = (j-i)+1;
                    } else{
                        
                    dp[i][j]= false;
                    }
                }else{
                    if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == true){
                       count =  (j-i)+1;
                      dp[i][j] = true; 
                    } else{
                        
                        dp[i][j]= false;
                    }
                }
            }
        }
        
        System.out.println(count);
    }

}