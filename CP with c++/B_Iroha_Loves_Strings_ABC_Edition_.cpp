#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int main(){
    fast
    int n,l;
    cin>>n>>l;
    string s[n];
    for(int i =0; i<n; i++){
        string loc;
        cin>>loc;
        s[i]= loc;
    }
    sort(s,s+n);

   for(int i =0; i<n; i++){
        cout<<s[i];
    }
   
    return 0;
}