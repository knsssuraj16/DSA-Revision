class Solution {
public:
    
      int divedss(vector<int>& nums,int st,int end,int target){
       if(st == end){
           return nums[st] == target ?st : -1;
       }
       int mid = (st + end)/2;
       
       int ele = divedss(nums, st, mid,target);
       int ele1 = divedss(nums, mid+1, end,target);
       
       return max(ele,ele1);
       
        
    }
    
    int search(vector<int>& nums, int target) {
         return divedss(nums,0,nums.size()-1,target);
        
    }
};