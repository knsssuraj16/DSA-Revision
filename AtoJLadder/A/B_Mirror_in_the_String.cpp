#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);
string solved(string s,int n){
    string res ="";
    res += s[0];
    for(int i =1;i< n; i++){
        if(s[i] >= s[i-1]){
         
            break;
        }
           res += s[i];
    }

    // return res;

    string ans =res;
reverse(res.begin(),res.end());
        ans +=res;  
    
 
 return ans;
}

int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){

        int n;
        cin >> n;
        string s;
        cin >>s;
        cout << solved(s,n)<<endl;
    }
    return 0;
}