#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

bool pali(string s){
    int i =0;
    int j = s.length()-1;
    while(i <= j){
        if(s[i] != s[j]){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
        int n,k;
        cin >> n>> k;
        string s;
        cin >> s;

        if(k <=1 || pali(s)){
            cout << 1 <<endl;
        }else{
            cout << 2<<endl;
        }
        
    }
    return 0;
}