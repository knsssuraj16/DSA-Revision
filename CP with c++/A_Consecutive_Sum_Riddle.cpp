#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7
#define int long long
#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
        int n;
        cin>>n;
        for(int i=0 ;i< n;i++){
            cout<< (i*(i+1)/2) <<" ";
        }
        cout<<endl;
    }
    return 0;
}