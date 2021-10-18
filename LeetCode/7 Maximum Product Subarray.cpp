class Solution {
public:
    int maxProduct(vector<int>& nums) {
        
        int posMax = INT_MIN;
        int locnegMax = 1; 
        int lopoMax = 1;
        for(int i =0; i< nums.size(); i++){
            
            
              int mx = locnegMax * nums[i];
                int mi = lopoMax * nums[i];
                 
                lopoMax = max(mx, max(nums[i], mi));
          
               locnegMax = min(mx, min(mi,nums[i]));
            
            
               posMax = max(posMax, lopoMax);
            
           
            
        }
        
        return posMax;
    }
};