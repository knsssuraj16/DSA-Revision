#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int s[9];
int main(){
    fast
    string s;
    cin>>s;
    unordered_map<char,int> mp;
    for(int i=0; i<s.length();i++){
        mp[s[i]]++;
    }
    bool check= true;
    for(auto a: mp){
        if(a.second % 2 !=0){
            cout<<"No";
            return 0 ;
        }
    }   
   cout<<"Yes";
    return 0;
}