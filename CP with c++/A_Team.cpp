#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int n;
    cin >> n;
    int count=0;
    while(n--){
      int a,b,c;
      cin >>a>>b>>c;
      int loc=0;
        if(a){
            loc++;
        }
        if(b){
            loc++;
        }
        if(c){
            loc++;
        }

        if(loc >= 2){
            count++;
        }

    }

    cout<<count;

    
   
    return 0;
}