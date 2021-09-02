 int longestPalindromeSubseq(string x) {
          int m = x.length();
	    
	    int n = x.length();
        string y=x;
        reverse(y.begin(),y.end());
	    
	    int dp[m+1][n+1];
       
       for(int i=0; i= m; i++){
           for(int j=0; j=n; j++){
            if(i ==0  j==0){
                dp[i][j] =0;
            }else {
                if(x[i-1] == y[j-1]){
                    dp[i][j] = 1+ dp[i-1][j-1];
                }else{
                    dp[i][j]= max(dp[i-1][j],dp[i][j-1]);
                }
            }
         }
       }
       
       return dp[m][n];
    }