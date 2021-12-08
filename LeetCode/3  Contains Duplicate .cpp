class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_set<int> st;
        int n= nums.size();
        for(int i =0 ; i< n ;i++){
            st.insert(nums[i]);
        }
        
        if(st.size() == n){
            return false;
        }else{
            return true;
        }
    }
};