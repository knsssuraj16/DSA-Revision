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
    for(int i =1; i<=t; i++){

        char a,b,c;
        cin >> a>>b>>c;

        char ra,rb;
        cin >> ra >>rb;

        if(a == ra || a== rb){
            cout << a<<endl;
        }else if (b == ra || b== rb){
             cout << b<<endl;
        }
        else{
             cout << c<<endl;
        }
    }
    return 0;
}