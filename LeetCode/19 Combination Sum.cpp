class Solution {
public:
    
    vector<vector<int>> helper(vector<int>& arr, int t,int n,vector<int> &res ,vector<vector<int>>& ans){
        if(t == 0){
           ans.push_back(res);
            return ans;
        }
        if(n==0){
            vector<vector<int>> vec;
            return vec;
        }
        
        
        
        
        if(arr[n-1] <= t){
            res.push_back(arr[n-1]);
             helper(arr,t- arr[n-1],n, res,ans);
            res.pop_back();
            
           
      
        }
        
           helper(arr,t,n-1, res,ans);
            
          
        
        
        return ans;
        
    }
    vector<vector<int>> combinationSum(vector<int>& candidates, int target) {
        vector<int> vec;
        vector<vector<int>> res;
        return helper(candidates,target,candidates.size(),vec,res);
    }
};