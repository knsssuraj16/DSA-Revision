#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

bool check(string s){
    int j =0;
    int loc[5] = {'h','e','l','l','o'};
    for(int i =0 ;i < s.length(); i++){
        if(loc[j] == s[i]){
            j++;
        }
    }
    if(j ==5){
        return true;
    }
    return false;
}
int32_t main(){
    fast
    string  s;
    cin >> s;

    if(check(s)){
        cout << "YES"<<endl;
    }else{
        cout << "NO"<< endl;
    }
    
    return 0;
}