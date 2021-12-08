class Solution {
public:
    
    int helper(int n,vector<int>& nums,vector<int>& dp){
        if(n <= 0){
            return 0;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
        int ele = nums[n-1] +  helper(n-2,nums,dp);
        int ele2 = helper(n-1,nums,dp);
        
        dp[n] = max(ele,ele2);
        return max(ele,ele2);
        
        
    }
    int rob(vector<int>& nums) {
        vector<int> dp(nums.size()+1, -1);
        return helper(nums.size(),nums,dp);
    }
};