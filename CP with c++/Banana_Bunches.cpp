#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int findTree(int n,int sum,int i, vector<int> &arr,int one,vector<vector<vector<int>>> &dp){
    // cout<<"sum: "<<sum<<endl;
     if( one >2 ){
         
        dp[i][sum][one] = INT_MAX;
          return INT_MAX; 
       }
    if(sum == 0){
      
        return 0;
    }
    if(i == n || sum < 0 ){
        return INT_MAX;
    }

    if(dp[i][sum][one] != -1){
        return dp[i][sum][one];
    }
  

      int res =findTree(n,sum -arr[i],i+1,arr,(one == 0 ? one+1: one),dp) ;
     int inc = res == INT_MAX ? INT_MAX :res+1 ;
    int ex = findTree(n,sum,i+1,arr,one == 0 ? one: one+1,dp);
    //  cout<<min(inc,ex)<<endl;
    dp[i][sum][one] =min(inc,ex);
    return min(inc,ex) ;
}
int32_t main(){
    fast
    int t;
    cin >> t;
    for(int it =1; it<=t; it++){

       int n,k;
       cin >>n>>k;
       vector<int> arr(n);
       for(int i=0; i< n;i++){
           cin>> arr[i];
       }
       vector<vector<vector<int>>> dp(n+1,vector<vector<int>>(k+1,vector<int>(10,-1)));
       
    //    for(int i =0; i<=n; i++){
    //       for(int j =0; j<=k ;j++){
    //           cout<<dp[i][k];
    //       }
    //   }
       int res = findTree(n,k,0,arr,0,dp);
       
     cout<< "Case #"<<it<<": "<<( res ==INT_MAX ?-1:res) <<"\n";
      

    //   for(int i =0; i<=n; i++){
    //       for(int j =0; j<=k ;j++){
    //           cout<<dp[i][k]<<" ";
    //       }
    //   }
        
    }
    return 0;
}