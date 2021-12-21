#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    int t;
    cin >> t;
    vector<int> arr(t);
    for(int i =0; i<t; i++){

        cin >> arr[i];
        
    }
    vector<int> ans (t);

    for(int i =0; i<t; i++){

        ans[arr[i]-1]=i+1;
    }

     for(int i =0; i<t; i++){

        cout << ans[i]<<" ";
    }




    return 0;
}