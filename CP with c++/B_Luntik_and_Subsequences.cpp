#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define int long long

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int solve(vector<int > &vec,int n,int tot,vector< vector<int>> & dp){
    
    if(tot == 0){
        return 1;
        
    }

    if(tot<0){
        return 0;
    }

    if(n==0){
        return 0;
    }

    if(dp[n][tot] != -1){
            
            return dp[n][tot];
     }

        int  inc = solve(vec,n-1,tot-vec[n-1],dp);
        
        int ex =  solve(vec,n-1,tot,dp);

      
        dp[n][tot] = inc+ex;
    
      

    return inc+ex;

}
int32_t main(){
    fast
    int t;
    cin >> t;
    for(int it =1; it<=t; it++){
       
        int n;
        cin>> n;
        vector<int >vec(n);
        int tot =0 ;
        for(int i=0;i<n;i++){
            cin>>vec[i];
           tot +=vec[i]; 
        }

        
      vector< vector<int>> dp(n+1,vector<int>(tot,-1));
        int res= solve(vec,n,tot-1,dp);
        cout<< (tot-1 == 0 ?1 +res :res) <<"\n";
        
    }
    return 0;
}