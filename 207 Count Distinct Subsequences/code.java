import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        int n = s.length()+1;
        long dp []= new long[n];
        dp[0] =1;
        HashMap<Character,Integer> hm= new HashMap();
        for(int i =1; i< n; i++){
            dp[i] = 2 *dp[i-1];
            char ch = s.charAt(i-1);
            if(hm.containsKey(ch)){
                int j = hm.get(ch);
                dp[i] = dp[i]-dp[j-1];
            }
            hm.put(ch,i);
        }
        
        System.out.println(dp[n-1]-1);

    }
}