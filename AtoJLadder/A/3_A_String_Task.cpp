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
    string res = "";
    for(int i =0; i< s.length();i++){
        if(s[i] != 'A' &&s[i] != 'E' &&s[i] != 'I' &&s[i] != 'O' &&s[i] != 'U' &&s[i] != 'Y' &&s[i] != 'a' &&s[i] != 'e' &&s[i] != 'i' &&s[i] != 'o' &&s[i] != 'u' &&s[i] != 'y' ){
            if(s[i] < 'a'){
                res+= ".";
                res += ((char)('a'+(s[i] - 'A')));
                
            }else{
                
                res+= ".";
                res +=(s[i]);
            }

            
        }
    }

    cout << res <<endl;
    return 0;
}