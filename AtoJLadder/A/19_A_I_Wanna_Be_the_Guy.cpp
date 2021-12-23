#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    int n;
    cin >>n;
    vector<bool> lev(n,false);

    int p ;
    cin >> p;
    for(int i =0 ;i< p; i++){
        int a;
        cin >> a;
        lev[a-1]= true;
    }
    int q ;
     cin >> q;
    for(int i =0 ;i< q; i++){
        int a;
        cin >> a;
        lev[a-1]= true;
    }

    
    for(int i =0 ;i< n; i++){
       if(!lev[i]){
           cout << "Oh, my keyboard!";
           return 0;
       }
    }
         cout << "I become the guy.";
           return 0;
}