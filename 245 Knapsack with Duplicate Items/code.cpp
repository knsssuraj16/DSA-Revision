
class Solution{
public:
    int knapSack(int N, int W, int val[], int wt[])
    {
        int dp[N+1][W+1];
        
        
        
        for(int i =0; i<=N; i++){
            for(int j =0; j<=W; j++){
                if(i ==0 || j ==0){
                    dp[i][j] = 0;
                }else{
                    if(wt[i-1] <= j){
                        int ex= dp[i-1][j];
                        int inc = val[i-1] + dp[i][j-wt[i-1]];
                        dp[i][j] = max(ex,inc);
                    }else{
                        
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
        }
        
        return dp[N][W];
    }
};