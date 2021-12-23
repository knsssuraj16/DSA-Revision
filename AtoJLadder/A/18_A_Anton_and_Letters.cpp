#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    char s[1001];
    gets(s);
    unordered_set<char> se;
    for(int i =0 ; i< strlen(s); i++){
        se.insert(s[i]);
    }

    if(se.size() == 2){
        cout << se.size()-2 << endl;
    }else if(se.size() == 3){

    cout << se.size()-2 << endl;
    }else{

    cout << se.size()-4 << endl;
    }
    return 0;
}