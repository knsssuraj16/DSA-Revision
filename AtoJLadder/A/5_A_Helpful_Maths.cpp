#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    string s;
    cin >> s;
    string res;
    for(int i =0; i< s.length(); i++){
        if(s[i] != '+'){
            res.push_back(s[i]);
        }
    }

    sort(res.begin(),res.end());
    s="";
    for(int i =0; i< res.length(); i++){
        s+=res[i];
        s+='+';
    }



    
        cout <<s.substr(0,s.length()-1);
    return 0;
}