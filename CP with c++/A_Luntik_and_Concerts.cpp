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
    for(int it =1; it<=t; it++){
        long long a,b,c;
        cin>> a>>b>>c;

        a= a*1;
        b*=2;
        c*=3;
    //    long long res=0;

        if((a+b+c) % 2 == 0){
            cout<<0<<endl;
        }else{
                cout<<1<<endl;
        }
 
        
    }
    return 0;
}