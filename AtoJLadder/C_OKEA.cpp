#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double
#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

int32_t main(){
    fast
    int t;
    cin >> t;

    vector<bool> seive(1000,true);
    seive[0]= false;
    seive[1] =false;
    for(int i=2; i<1000; i++){
        if(seive[i]){
            for(int j =2 ;j*i<1000; j++){
                seive[i*j]= false;
            }
        }
    }
    for(int i =1; i<=t; i++){
        int count =0; 
         for(int j =1; j<=i ; j++){
             int lcm = (i*j)/__gcd(i,j);
             if((i*j) ==lcm){
                 count++;
             }
         }       
        if(seive[count]){
            cout << i <<endl;
        }
    }
    return 0;
}