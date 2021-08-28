
int Solutionsolve(vectorint &A) {

     int sum = 0;
     int n = A.size();
    for(int i =0; iA.size(); i++){
        sum += A[i];
    }

    bool dp[n+1][sum+1];
    for(int i =0; i= n; i++){
        for(int j =0; j=sum; j++){
            if (i==0 && j ==0){
                dp[i][j] = true;
            }else if (i ==0){
                dp[i][j] = false;
            }else if (j == 0){
                dp[i][j] = true;
            }else{
                if(A[i-1]= j){
                    dp[i][j] = dp[i-1][j]  dp[i-1][j-A[i-1]];
                }else{
                     dp[i][j] = dp[i-1][j];
                }
            }
        }
    }

    vectorint res;
    
    for(int i =0; i=sum2; i++){
         

        if(dp[n][i] ==true){
            res.push_back(i);
        }
    }

    int mins= INT_MAX;

    for(int i =0; ires.size(); i++){

        mins = min(mins,sum-2res[i]);
    }
    return mins;
}
