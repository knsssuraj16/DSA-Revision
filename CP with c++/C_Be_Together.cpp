#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);



int solve(int arr[], int n, int val){
    int tot=0;
    for(int i =0 ; i< n; i++){
        int a =arr[i]-val;
        tot += a*a;
    }
    return tot;
}


int main(){
    fast
    int n;
    cin>>n;
  
    int s[n];
    int mn=INT_MAX;
    int mx=INT_MIN;
    for(int i =0; i<n; i++){
        int loc;
        cin>>loc;
        mn=min(mn,loc);
        mx=max(mx,loc);
        s[i]= loc;
    }

    int res=INT_MAX;
    for(int i = mn; i<=mx;i++){
       res =  min(res,solve(s,n,i));
    }
    cout<< res;

  
   
    return 0;
}