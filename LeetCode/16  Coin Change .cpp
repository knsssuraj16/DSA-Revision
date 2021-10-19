class Solution {
public:
    int helper(vector<int>& coins,int amount, vector<vector<int>> &dp, int n){
        
        if(amount == 0){
            return 0;
        }
        if(n== 0){
            return INT_MAX-1;
        }
        int inc=INT_MAX-1,ex=INT_MAX-1;
        
        if(dp[n][amount] != -1){
            return dp[n][amount];
        }
        
        if(coins[n-1] <= amount){
            inc = 1+ helper(coins,amount-coins[n-1],dp,n);
            ex= helper(coins,amount,dp,n-1);
            
        }else{
            ex =  helper(coins,amount,dp,n-1);
        }
        
        dp[n][amount] = min(inc,ex);
        
        return dp[n][amount];
    }
    
    int coinChange(vector<int>& coins, int amount) {
        
        vector<vector<int>>  dp(coins.size()+1,vector<int>(amount +1, -1));
        int res = helper(coins,amount,dp,coins.size());
        return  (res ==2147483646 ?-1:res);
        
//         int n = coins.size();
//         int sum = amount ;
//         int dp[n+1][sum+1];
        
//         for(int i =0; i<=n; i++){
//            for(int j =0; j<=sum; j++){
//             if(i==0 && j==0){
//                 dp[i][j]= 0;
//             }else if(i ==0){
//                 dp[i][j]=INT_MAX-1;
//             }else if (j == 0){
//                 dp[i][j]= 0;
//             }else{
//                 if(coins[i-1] <= j){
                     
//                     int inc = 1 + dp[i][j - coins[i-1]] ;
                   
//                     int ex = dp[i-1][j];
//                     dp[i][j] = min(inc,ex);
                    
                    
//                 }else{
//                      dp[i][j] = dp[i-1][j];
//                 }
//             }
//          }
//         }
        
//         return dp[n][sum] == 2147483646? -1:dp[n][sum];
        
        
    }
};