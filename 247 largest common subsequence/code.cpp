int lcs(int x, int y, string s1, string s2)
    {
      int dp[x+1][y+1];
      for(int i =0; i<x+1; i++){
          for(int j=0; j<y+1; j++){
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
      
      return dp[x][y];
    }