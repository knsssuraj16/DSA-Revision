class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int mxSum = INT_MIN;
        int locSum = 0;
        for(int i = 0 ;i< nums.size(); i++){
           
            if(locSum < 0 ){
                locSum = 0;
            }
            
             locSum += nums[i];
            
            mxSum = max(mxSum, locSum);
            
        }
        
        return mxSum;
        
    }
};