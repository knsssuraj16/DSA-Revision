#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
 
    int c;
    int r;
    cin>> c>>r;
    vector<int> arr;
    for(int i =0 ;i< r; i++){
        int a ;
        cin >>a ;
        arr.push_back(a);
    }

// 10 12 10 7 5 22
// 5 7 10 10 12 22 

    sort(arr.begin(),arr.end());
    int mn = INT_MAX;
    for(int i =c-1 ;i< r; i++){
        // cout << i-c+1<<" ";
        mn = min(arr[i] - arr[i-c+1], mn);
    }

    cout << mn <<endl;
    return 0;
}
