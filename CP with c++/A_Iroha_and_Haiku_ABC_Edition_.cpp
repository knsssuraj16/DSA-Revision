#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int main(){
    fast
    int a,b,c;
    cin>>a>>b>>c;

    if(a== 5 && b== 5 && c== 7){
        cout<<"YES";
    }else if (a== 7 && b== 5 && c== 5){
        cout<<"YES";
    }else if (a== 5 && b== 7 && c== 5){
        cout<<"YES";
    }else {
        cout<<"NO";
    }
    return 0;
}