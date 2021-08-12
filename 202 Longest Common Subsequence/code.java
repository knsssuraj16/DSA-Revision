import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scan= new Scanner(System.in);
        
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        
        int dp[][] = new int[s1.length()+1][s2.length()+1];
        
        for (int i =s1.length() ; i>=0 ; i--){
            for (int j =s2.length() ; j>=0; j--){
                if(i ==s1.length() || j == s2.length()){
                    dp[i][j] = 0;
                }else if (s1.charAt(i) == s2.charAt(j)){
                    dp[i][j] =dp[i+1][j+1]+1;
                }else if (s1.charAt(i) != s2.charAt(j))
                {
                    int maxs=Math.max(dp[i+1][j],dp[i][j+1]);
                    dp[i][j] =maxs;
                }
            }

        }
        
        System.out.println(dp[0][0]);

    }

}