#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int t;
    cin >> t;
    while(t--){
        int n;
        cin >>n;
        int maxs= INT_MIN;
        int mins= INT_MAX;
        int imin1=0;
        cin >>imin1;
        int res= 0;
        for(int i=1; i<n; i++){
            int val ;
            cin>> val;
            res = max(res,(imin1* val));
            imin1= val;
        }
        cout<< res<<endl;

    }


    
   
    return 0;
}