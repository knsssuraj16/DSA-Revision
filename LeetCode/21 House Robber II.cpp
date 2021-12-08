class Solution {
public:
    int helper(vector<int> &nums, int n,vector<int>& dp ){
        
        if(n<= 0){
           
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        
           int ele =0;
       ele = nums[n-1] + helper(nums,n-2,dp);
             // }
       
        
        int ele1 = helper(nums,n-1,dp);
        
        dp[n] =  max(ele,ele1);
        return max(ele,ele1);
        
    }
    int rob(vector<int>& nums) {
        
        if(nums.size() == 1){
            return nums[0];
        }
        vector<int> front = nums;
        vector<int> back = nums;
        back.pop_back();
        front.erase(front.begin());
        
        vector<int> dp(back.size()+1,-1);
        int ele1 = helper(back,back.size(),dp);
            
        vector<int> dps(front.size()+1,-1);
        int ele2 = helper(front,front.size(),dps);
        
        
        return max(ele1,ele2);
    }
};