class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        int n = coins.size();
        int sum = amount ;
        int dp[n+1][sum+1];
        
        for(int i =0; i<=n; i++){
           for(int j =0; j<=sum; j++){
            if(i==0 && j==0){
                dp[i][j]= 0;
            }else if(i ==0){
                dp[i][j]=INT_MAX-1;
            }else if (j == 0){
                dp[i][j]= 0;
            }else{
                if(coins[i-1] <= j){
                     
                    int inc = 1 + dp[i][j - coins[i-1]] ;
                   
                    int ex = dp[i-1][j];
                    dp[i][j] = min(inc,ex);
                    
                    
                }else{
                     dp[i][j] = dp[i-1][j];
                }
            }
         }
        }
        
        return dp[n][sum] == 2147483646? -1:dp[n][sum];
        
        
    }
};