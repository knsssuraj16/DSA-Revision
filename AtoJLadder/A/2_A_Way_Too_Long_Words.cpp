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
        string s;
        cin >> s;
        if(s.length() > 10){
            cout<< s[0]<<s.length()-2<<s[s.length()-1]<<endl;
        }else{
            cout << s<< endl;
        }
        
    }
    return 0;
}