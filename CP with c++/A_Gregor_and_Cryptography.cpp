#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int t;
    cin >> t;
    while(t--){
        int m;
        cin>>m;

        int i=2;
        m--;

        int j = m/i; 

        // cout<<j<<" m" <<m <<endl;  
        while(j<=m){
            
            if(m % j ==0  && i != j){
                  cout<< i<<" "<<j<<endl;
               break;
              }else{
                j++;
          }
      
        }

    }


    
   
    return 0;
}