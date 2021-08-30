
vector<int> longestCommonSubsequence(vector<int> s1, vector<int> s2) {
    int m=s1.size();
    int n = s2.size();
    int dp[m+1][n+1];
    
    for(int i =0; i<m+1; i++){
          for(int j=0; j<n+1; j++){
              if(i==0 || j==0){
                  dp[i][j] = 0;
              }else {
                  if(s1[i-1] == s2[j-1]){
                      dp[i][j] =1+ dp[i-1][j-1];
                  }else{
                      dp [i][j] = max(dp[i][j-1],dp[i-1][j]);
                  }
              }
          }
      }
      vector<int> res;
      cout<<"dp : "<<dp[m][n];
      int i = m+1,j=n+1;
      while(i > 0 && j>0){
          if(s1[i-1] == s2[j-1]){
             res.push_back(s1[i-1]); 
             i--;j--;
          }else{
              if(dp[i-1][j] >dp[i][j-1]){
                  i--;
              }else{
                  j--;
              }
          }
      }
      
       reverse(res.begin(),res.end());
      return res;
}
