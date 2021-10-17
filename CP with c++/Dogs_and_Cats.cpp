#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define int long long
#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    int t;
    cin >> t;
    for(int it =1; it<=t; it++){

       int n, d, c,m;
       cin >> n>>d>>c>>m;

       string s;
       cin >> s;
       bool cf = true, df= true;
       int i = 0;
       for(; i< n; i++){
           if(s[i] == 'C'){
               if(c <=0 ){
                   break;
               }
               c--;
           }else{
               
               d--;
               c+=m;

           }
           if(c == -1){
                   cf = false;
               }

          if(d == -1){
              break;
                   df = false;
          }
 } 

    for(;i<n;i++){
         if(s[i] == 'D'){
               df = false;
               break;
           }
    }

       
            

       if(df){
           cout<< "Case #"<<it <<": YES\n";
       }else{
            cout<< "Case #"<<it <<": NO\n";
       }
        
    }
    return 0;
}