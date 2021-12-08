class Solution {
public:
    
   int divedss(vector<int>& nums,int st,int end){
       if(st == end){
           return nums[st];
       }
       int mid = (st + end)/2;
       
       int ele = divedss(nums, st, mid);
       int ele1 = divedss(nums, mid+1, end);
       
       return min(ele,ele1);
       
        
    }
    int findMin(vector<int>& nums) {
        return divedss(nums,0,nums.size()-1);
    }
};