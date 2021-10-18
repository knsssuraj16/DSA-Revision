class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        vector<vector<int>>  res;
        int n =  nums.size();
        sort(nums.begin(), nums.end());
        if(n<3) return res;
        
        for(int i = 0 ;i< n-2 ; i++){
                     
             int tot = -1* nums[i];
            int j = i+1;
            int k = n-1;
            
            while(j<k){
                if((nums[j] + nums[k]) == tot){
                    vector<int> vec(3);
                    
                    vec[0] = nums[i];
                    vec[1] = nums[j];
                    vec[2] = nums[k];
                    
                    res.push_back(vec);
                    while(j<k && nums[j]==vec[1]) j++;
                    while(j<k && nums[k]==vec[2]) k--;
                    
                }else if((nums[j] + nums[k]) > tot){
                    k--;
                }else{
                    j++;
                }
            }
            
            while(i+1<n && nums[i] == nums[i+1]) i++;
        }
        
        return res;
    }
};