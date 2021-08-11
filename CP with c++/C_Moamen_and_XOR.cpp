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
        int n,k;
        cin>>n >>k;
        double ko =(1<<n);
        int count=0;
        if(k ==0 ){
              cout<<1<<endl;
              break;
        }
        for(int  i =0; i<= ko;i++){
            if((i&(i-1)) >= (i^(i-1)) ){
                count++;
            }
        }

            cout<<count<<endl;

    }


    
   
    return 0;
}