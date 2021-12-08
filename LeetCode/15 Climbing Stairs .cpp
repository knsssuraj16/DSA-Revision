class Solution {
public:
    
    int climbHelper(int n, vector<int> & dp){
        if(n == 0){
            return 1;
        }
        
        if(n == -1){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n-1];
        }
        int t1 = climbHelper(n-1,dp) ;
        int t2 = climbHelper(n-2,dp);
        dp[n] = t1+t2;
        return dp[n];
    }
    int climbStairs(int n) {
        
        vector<int> dp(n+1,-1);
        return climbHelper(n,dp);
        
    }
};