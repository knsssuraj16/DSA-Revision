#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int32_t main(){
    fast
   
    string s,res="";
    cin>>s;
    for(int i=0; i< s.length(); i++){
        if(s[i] != 'a' &&s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u' && s[i] != 'A' &&s[i] != 'E' && s[i] != 'I' && s[i] != 'O' && s[i] != 'U'&& s[i] != 'y'&& s[i] != 'Y'){
            if(s[i] < 'a'){

                
            res+='.';
            int r= 'a'-'A';
                
            res+=s[i]+r;
            }else {

            res+='.';
            res+=s[i];
            
            }
        }
    }

    cout<<res;

    
   
    return 0;
}