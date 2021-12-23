#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    long long n,k;
    cin>>n>>k;
    n=(n+1)/2;
    // cout << n;
    if(k>n){
        cout<< 2 * (k-n);
    }else{
        cout<< 2* k-1;
    }

    return 0;
}