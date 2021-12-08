#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7
#define int long long
#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


bool solve(vector<vector<int>> &vec,int n){
   
    vector<int> dp(5,0);


    for(int i=0 ;i< 5;i++){
        int tot =0;
            for(int j =0; j< n;j++){
               tot += vec[j][i];
            }
               dp[i] = tot;
        }
    int c = 0;
     for(int i=0 ;i< 5;i++){
        //  cout<<dp[i] <<" ";
               if(dp[i] >= n/2){
                   c++;
               }
        }
        if(c>=2){
            return true;
        }
    return false;
    }
int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
        int n;
        cin>>n;
        vector<vector<int>> vec(n,vector<int>(5));
        for(int i=0 ;i< n;i++){
            for(int j =0; j<5;j++){
                cin>>vec[i][j];
            }
        }
        // vector<vector<bool>> vis(n,vector<bool>(n,false));
        if(solve(vec,n)){
            cout<<"YES"<<endl;   
        }else{
              cout<<"NO"<<endl;   
        }
        
    }
    return 0;
}