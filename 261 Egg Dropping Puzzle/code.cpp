Egg Dropping Puzzle     public:
    int dp[201][201];
    int solve(int e, int f){
        if (f<= 1 || e<= 1){
            return f;
        }
        
        if(dp[e][f] != -1){
            return dp[e][f];
        }
        int mn =INT_MAX;
        for (int k =1; k<=f; k++){
            int temp = 1+ max(solve(e-1,k-1),solve(e,f- k));
            
            mn= min(temp,mn);
        }
        
        dp[e][f]= mn;
        return mn;
    }
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    int eggDrop(int e, int f) 
    {
        memset(dp,-1,sizeof dp);
        return solve(e,f);
        
    }