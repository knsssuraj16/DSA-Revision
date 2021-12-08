#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


long long dp[50][50][50];
long long solve(int arr[],int n,int k,int sum,int c){
 
    
   if(n== 0){
        if(c != 0&& sum % c == 0 && (sum /c )== k ){
          return 1L;
        }
    return 0L;    
   }
  
    if(dp[n][sum][c] != -1){
        return dp[n][sum][c];
    }

   long long inc = solve(arr,n-1,k,sum+arr[n-1],c+1); 

   long long ex = solve(arr,n-1,k,sum,c);

   dp[n][sum][c] = inc+ex;
    return  dp[n][sum][c] ;

}
    
int main(){
    fast
    int n,k;
    cin >>n>>k;
    int arr[n];
    memset(dp,-1,sizeof(dp));
    
    for(int i =0 ;i<n;i++){
        int a;
        cin>>a;
        arr[i]=a;
    }    
    
     cout<< solve(arr,n,k,0,0);
    return 0;
}