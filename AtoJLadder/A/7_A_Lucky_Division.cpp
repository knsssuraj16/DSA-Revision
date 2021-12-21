#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

bool solve(string check){
    for(int i =0; i< check.length();i++){
        if(check[i] != '4' && check[i] != '7'){
            return false;
        }
    }
    return true;
}
int32_t main(){
    fast
    int n;
    cin >> n;
    string check = to_string(n);
    if(solve(check)){
        cout << "YES";
    }else{
    if(n % 4 ==0 || n % 7 ==0 || n % 47 ==0 || n % 74 ==0 ){
        cout << "YES";
    }else{
        cout << "NO";
    }
    }
    return 0;
}