#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int s[9];
int main(){
    fast
    
    string s ;
    cin>>s;
    string ns="";
    for(int i =0; i<s.length();i++){
        if(s[i] == 'B' && ns.length() != 0){
            ns.pop_back();
        }
        else if (s[i] != 'B'){
            ns.push_back(s[i]);
        }
    }
    cout<<ns;
   
    return 0;
}