#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7
#define int long long
#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


bool solve(vector<vector<int>> &vec,int i,int j,int r,int c,  vector<vector<bool>> &vis){
    if(i <0 || j<0 || i == r || j ==c || vec[i][j] == 1 || vis[i][j] ==true ){
        return false;
    }

    if(i == (r-1) && j == (c-1)){
        return true;
    }
    
    vis[i][j] = true;

    if(solve(vec,i,j+1,r,c,vis)){
        return true;
   }
   if(solve(vec,i+1,j,r,c,vis)){
        return true;
   }
    if (solve(vec,i+1,j+1,r,c,vis)){
        return true;
   }

   if(solve(vec,i-1,j+1,r,c,vis)){
       return true;
   }
  
   
   
    // vis[i][j] = false;

   return false;
}
int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
        int n;
        cin>>n;
        vector<vector<int>> vec(2,vector<int>(n));
        for(int i=0 ;i< 2;i++){
            string s;
            cin>>s;
            for(int j =0; j<s.length();j++){
               vec[i][j] = s[j] - '0';
            }
        }
        vector<vector<bool>> vis(2,vector<bool>(n,false));
        if(solve(vec,0,0,2,n,vis)){
            cout<<"YES"<<endl;   
        }else{
              cout<<"NO"<<endl;   
        }
        
    }
    return 0;
}