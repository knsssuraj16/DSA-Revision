#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




int main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
       int b1,b2,b3;
       cin>>b1>>b2>>b3;
       int cap, capc;
       
       cin>>cap>>capc;
       int cc= min(b1,min(b2,b3));
       if(cc <= capc && ((b1+b2+b3)-cc) <= cap){
           cout<<"YES\n";
       }else{
           cout<<"NO\n";
       }
    }
    return 0;
}