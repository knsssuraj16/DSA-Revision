class Solution {
public:
    
    int helper(string &s,int i,vector<int> &dp){
     
        if(i >= s.size()){
            return 1;
        }
        
      if(s[i] == '0' ){
          
          return 0;
       }
        
        
        if(dp[i] != -1){
            return dp[i];
        }
        
         int res=0;
         int res1=0;
        
         res = helper(s,i+1,dp);
         
        if(i+1 < s.length() ){
            int cat= (((s[i] -'0') * 10) + (s[i+1]-'0'));
        
            if(  cat <=26 ){
                 res1 = helper(s,i+2,dp);
            }
          }
        
//         cout<<"res1: "<<res <<endl;
        
//         cout<<"res2: "<<res1 <<endl;
        
        dp[i] = (res+res1);
       return (res+res1); 
        
    }
    int numDecodings(string s) {
        vector<int> dp(s.length()+1,-1);
        return helper(s,0,dp);
    }
};