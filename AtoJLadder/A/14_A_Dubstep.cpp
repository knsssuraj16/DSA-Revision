#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    // string s;
    // cin>>s;
    // regex a("WUB");
    // cout<<regex_replace(s,a," ");


    string s;
    cin >> s;
    regex r("WUB");
    cout << regex_replace(s,r," ");

    return 0;
}




//     string loc = "WUB";

//     vector<string> token;

//     stringstream check1(s);

//     string word;

//     while(getline(check1,word,' ')){
//         token.push_back(word);
//     }

//    for(int i = 0; i < token.size(); i++)
//         cout << token[i] << '\n';