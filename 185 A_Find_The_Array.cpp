#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int sol(int n,int till){

    int count =1;
    int tot =1;
    while(tot < n){
        till+=2;
        tot+=till;
        count++;
    }
    return count;
}
void input(){
    int n;
    cin >> n;

    

     cout << sol(n,1)<<endl;
}


int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){
        input();
    }
    return 0;
}