class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int tot =1;
        int tot2 =1;
        vector<int> vec;
        vector<int> rvec(nums.size());
        vec.push_back(1);
        for(int i = 1 ;i < nums.size(); i++){
            vec.push_back(vec[i-1] * nums[i-1]);
        }
        
         rvec[nums.size()-1]=1;
        
         for(int i = nums.size()-2 ;i >= 0; i--){
            rvec[i] = rvec[i+1] * nums[i+1];
        }
        
         for(int i = nums.size()-1 ;i >= 0; i--){
            nums[i] = rvec[i] * vec[i];
        }
        
        return nums;
        
    }
};