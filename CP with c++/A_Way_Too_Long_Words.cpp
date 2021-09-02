#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);



void input(){
    string s;
    cin>>s;
    if(s.length() <=10){
        cout<<s<<endl;
    }else{
        
        cout<<s[0] <<s.length()-2<<s[s.length()-1]<<endl;
    }
    
}
int32_t main(){
    fast
    int t;
    cin >> t;
    
   while(t--){
       input();
   }
    return 0;
}