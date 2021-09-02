#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int32_t main(){
    fast
   
    int n,m,a;
    cin>>n>>m>>a;
    int aa= n%a==0? n/a : (n/a)+1;
    int bb= m%a==0? m/a : (m/a)+1;
    cout<<aa*bb;


    
   
    return 0;
}