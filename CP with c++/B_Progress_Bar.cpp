#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int n,k,t;
    cin >> n>>k>>t;

    int tot= (n*k*t)/100;
    while(n--){
        cout<<min(k,tot)<<" ";
        tot-=min(k,tot);
    }


    
   
    return 0;
}