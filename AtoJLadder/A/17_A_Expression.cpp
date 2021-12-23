#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    int a,b,c;
    cin >> a>>b >>c;

    int mx=0;
    mx = max(a + b * c,mx);
    mx = max(a * (b + c),mx);
    mx = max(a * b * c,mx);
    mx = max((a + b )* c,mx);
    mx = max((a + b +c),mx);
    cout << mx <<endl;
    return 0;
}