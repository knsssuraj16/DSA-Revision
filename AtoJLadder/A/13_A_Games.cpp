#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    int n ;
    cin >>n ;
    vector<int> home(101);
    vector<int> guest(101);
    for(int i = 0; i<n; i++){
        int h, g;
        cin >> h;
        cin >> g;

        home[h]++;

        guest[g]++;
    }

    int res=0;

    for(int i = 0; i<=100; i++){
        
        res += home[i]* guest[i];
    }

    cout <<res;
    return 0;
}