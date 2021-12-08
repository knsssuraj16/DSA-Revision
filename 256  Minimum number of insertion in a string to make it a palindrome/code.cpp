int countMin(string str){
        int m= str.length();
        int n = str.length();
        
        string str2 = str;
        reverse(str2.begin(),str2.end());
        
        int dp[m+1][n+1];
        for(int i =0; i< m+1 ; i++){
        
            for(int j = 0; j<n+1;j++){
                
                if(i ==0 || j ==0){
                    dp[i][j] = 0;
                }else{
                    if(str[i-1] == str2[j-1]){
                        dp[i][j] = 1+ dp[i-1][j-1];
                    }else{
                        dp[i][j] =max(dp[i-1][j], dp[i][j-1]);
                    }
                }
            }
        }
        
        return (str.length()- dp[m][n]);
        
    }