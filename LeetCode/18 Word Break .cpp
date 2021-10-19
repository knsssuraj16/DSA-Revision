class Solution {
public:
    bool helper(string s,vector<string>&  dict, int i,int di,vector<vector<int>> &dp ){
        if(di == dict.size()){
            return false;
        } 
        if(i == s.length()){
            return true;
        }
        string str = dict[di];
        if(dp[i][di] != -1){
            return dp[i][di];
        }
        
        bool res = false;
        if(str.compare(s.substr(i,str.length())) == 0){
            res = helper(s,dict,i+str.length(),0,dp);
            if(res){
                dp[i][di] = true;
                return true;
            }
             res = helper(s,dict,i,di+1,dp);
            if(res){
                dp[i][di]= true;
                return true;
            }
        }else{
             
            res = helper(s,dict,i,di+1,dp);;
            if(res){
                dp[i][di]= true;
                return true;
            }
        }
        
        dp[i][di] = res;
        return res;
        
    }
    bool wordBreak(string s, vector<string>& wordDict) {
        vector<vector<int>> dp(s.length()+1,  vector<int> (wordDict.size()+1,-1));
        
        return helper(s,wordDict,0,0,dp);
    }
};