#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7
#define int long long
#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int dp[100][100];
int solve(vector<long long> &vec,int n,long long  mmtot,int i){
        if(i >= n-1){
            return 0;
        }
        int tot  = 0;
        for(int k = i+1;k<n;k++){
            cout<<"i "<<i <<" k "<<k<<endl;
          
             tot += solve(vec,n,mmtot,k);
             
            long long loctot = (mmtot - vec[i] - vec[k]);
             
             long long res = mmtot / n;
             long long res1 = loctot / (n-2);
             


                if( res == res1 ){
                    tot++;
                }
            
        }

        return tot;
    
    }
int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
        int n;
        cin>>n;
        vector<long long > vec(n);

        for(int i=0 ;i< n;i++){
            
                cin>>vec[i];
           
        }
          long long tot =0;
       for(int i = 0 ;i< n; i++){
            tot += vec[i];
        }
        if(tot % n == 0){
                    
            cout<< solve(vec,n,tot,0) <<endl;
        }else{
               cout<< 0 <<endl;
        }
        
    }
    return 0;
}