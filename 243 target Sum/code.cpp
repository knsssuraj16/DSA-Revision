class Solution {
public
    int findTargetSumWays(vectorint& nums, int target) {

        
        target = abs(target);
        
        int n = nums.size();
        int sum = 0;
        for(int i =0; inums.size() ;i++){
            sum += nums[i];
        }
        
        int t = (target+ sum)2;
        if((target+ sum)%2 !=0){
            return 0;
        }
        int dp[n+1][t+1];
        
       for(int i=0;i=n;i++){
            for(int j=0;j=t;j++){
                if(i==0) dp[i][j]=0;
                if(j==0) dp[i][j]=1;
            }
        }
        for(int i =1; i= n;i++){
            for(int j=0; j= t; j++){
               
                    
                     if(nums[i-1] = j){
                        dp[i][j] = dp[i-1][j- nums[i-1]] + dp[i-1][j];
                    }
                    else{
                        
                        dp[i][j] =  dp[i-1][j];
                    } 
                
            }
        }
        
        return dp[nums.size()][t];
        
    }
};