class Solution {
public:
    int combine(int st , int en,int mid, vector<int> &nums){
        int lm=INT_MIN;
        int lflm =0;
        for(int i=mid ; i>= st; i--){
           lflm+=nums[i] ;
            lm = max(lflm,lm);
        }
        
        int rm=INT_MIN;
        int lfrm =0;
        for(int i=mid+1 ; i<=en ; i++){
           lfrm+=nums[i] ;
            rm = max(lfrm,rm);
        }
        
        return lm+rm;
    }
    int divide(int st, int en, vector<int> &nums){
        
        if(st == en){
            return nums[st];
        }
            int mid = (st + en) /2 ;
            int lmax = divide(st,mid, nums);
            int rmax = divide(mid+1,en, nums);
            int comMax = combine(st, en,mid, nums);
        return max(lmax,max(rmax,comMax));
    }
    int maxSubArray(vector<int>& nums) {
        
        return divide(0,nums.size()-1, nums);
        
    }
};