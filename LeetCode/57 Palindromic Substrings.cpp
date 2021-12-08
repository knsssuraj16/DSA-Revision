class Solution {
public:
    int countSubstrings(string s) {
        
        int n = s.length();
        vector<vector<int>> dp(n,vector<int>(n,0));
        
        // int dp[n][n];
        
        int counter =0;
        for(int g =0; g< n; g++){
            for(int i =0, j =g; j<n ; i++,j++){
                if(g == 0){
                    dp[i][j] = 1;
                    counter++;
                }else if(g==1){
                    // dp[i][j] = dp[i+1][j] + dp[i][j-1];  
                    if(s[i] == s[j]){
                        dp[i][j] = 1;
                        counter++;
                    }
                }else{
                    
                     if(s[i] == s[j] && dp[i+1][j-1]){
                        dp[i][j] = 1;
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
};