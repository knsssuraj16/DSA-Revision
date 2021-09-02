#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int solve(vector<int> &A) {
     int sum = 0;
     int n = A.size();
    for(int i =0; i<A.size(); i++){
        sum += A[i];
    }

    bool dp[n+1][sum+1];
    for(int i =0; i<= n; i++){
        for(int j =0; j<=sum; j++){
            if (i==0 && j ==0){
                dp[i][j] = true;
            }else if (i ==0){
                dp[i][j] = false;
            }else if (j == 0){
                dp[i][j] = true;
            }else{
                if(A[i-1]<= j){
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-A[i-1]];
                }else{
                     dp[i][j] = dp[i-1][j];
                }
            }
        }
    }

    vector<int> res;
    
    for(int i =0; i<=sum/2; i++){
         

        if(dp[n][i] ==true){
            res.push_back(i);
        }
    }

    int mins= INT_MAX;

    for(int i =0; i<res.size(); i++){

        mins = min(mins,sum-2*res[i]);
    }
    return mins;
}

int32_t main(){
    fast

  vector<int> vec {1, 6, 11, 5};
    
  cout<<solve(vec);

  return 0;
}
