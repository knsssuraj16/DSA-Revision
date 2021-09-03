class Solution{
public:

   bool isPalindrom(string s,int i,int j){
       
       while(i< j){
          if(s[i] != s[j]){
               return false;
           }
           i++;
           j--;
       }
         
       return true;
   }
    int dp[501][501];
    int solve (string str , int i ,int j){
        
        if(i>=j){
            return 0;
        }
        
        
        
        if(isPalindrom(str,i,j)){
            return 0;
        }
        
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        
        int mn = INT_MAX;
        for(int k = i; k<=j-1; k++){
            int temp = (dp[i][k] != -1 ? dp[i][k]:solve(str,i,k))+(dp[k+1][j] != -1 ? dp[k+1][j]:solve(str,k+1,j))+1;
            mn = min(mn,temp);
        }
        
        dp[i][j] = mn;
        return dp[i][j];
        
    }
    
    int palindromicPartition(string str)
    {
        memset(dp,-1,sizeof dp);
        return solve( str,0,str.length()-1);
    }
};