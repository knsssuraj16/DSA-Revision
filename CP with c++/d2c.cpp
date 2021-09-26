#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


long long dp[50];
int a=0;
int solve(int arr[],int i,int n,vector<int> psf){
   
    if(i==n){
        return 1;
    }

 
    int count =0 ;
    for(int k =1; k <= arr[i];k++){
        if(psf.size() > 0 && psf[psf.size()-1] == k){
           
        }else{
             psf.push_back(k);
            count += solve(arr,i+1,n,psf);
            psf.pop_back();
        }
    }

    return count;
}
    
int main(){
    fast
    int n,k;
    cin >>n;
    int arr[n];
     memset(dp,-1,sizeof(dp));
    
    for(int i =0 ;i<n;i++){
        int a;
        cin>>a;
        arr[i]=a;
    }    
        vector<int > vec;
     cout<< solve(arr,0,n,vec);
    return 0;
}