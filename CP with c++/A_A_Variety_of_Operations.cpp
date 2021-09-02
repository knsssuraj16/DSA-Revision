#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);



int32_t main(){
    fast
    int t;
    cin >> t;

    while(t--){
        int a=0,b=0,c,d;
        cin>>c>>d ;
        if(c == d && c!=0 ){
            
             cout<<1<<endl;
        }else if (c == 0 && d==0)
        {
          
             cout<<0<<endl;
         
         }else{
            if ((c+d) % 2 == 0){
                cout<<2<<endl;
            }else if ((c+d )% 2 != 0){
                cout<<-1<<endl;
            }   
        }

    }


    
   
    return 0;
}
