class Solution {
public:
    int helper(int r,int c,int m,int n,vector<vector<int>> &dp){
        
        if(r==m-1 && c == n-1 ){
            return 1;
        }
        
        if(r == m || c==n ){
            return 0;
        }
        if(dp[r][c] != -1){
            return dp[r][c];
        }
        
        int res =0;
        res += helper(r+1,c,m,n,dp);
        res += helper(r,c+1,m,n,dp);
         
         dp[r][c] =res;
        return res;
    }
    int uniquePaths(int m, int n) {
        vector<vector<int>> dp (m+1,vector<int>(n+1,-1));
        return helper(0,0,m,n,dp);
    }
};