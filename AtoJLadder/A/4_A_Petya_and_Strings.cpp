#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    string s,s1;
    cin >> s>> s1;

    for(int i =0;i< s.length(); i++){
        int a =tolower(s[i]);
        
        int a1 =tolower(s1[i]);

        if(a < a1){

            cout <<-1;
            
            return 0;

        }else if(a > a1){

            cout <<1;
            
             return 0;
        }
    }
    
        cout <<0;
    return 0;
}