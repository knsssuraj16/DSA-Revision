#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);

 unordered_set<int> s;

void check(int kx,int ky){
    if(kx == 0 || ky== 0 ||kx == 9 || ky == 9){
        return ;
    }

    s.insert(kx);
    s.insert(ky);

    

}

void erase (int b){
      auto a =s.find(b);
      if( a != s.end()){
          s.erase(a);
      }
}

bool checkSafe(int kx,int ky,int r1x,int r1y,int r2x,int r2y){
   


       check(kx+1,ky);
       check(kx,ky+1);
       check(kx-1,ky);
       check(kx,ky-1);
       check(kx+1,ky+1);
       check(kx-1,ky-1);
       check(kx+1,ky-1);
       check(kx-1,ky+1);

    //    for(auto i = s.begin() ; i != s.end(); i++){
    //         cout << *i <<" ";
    //    }

    // for(auto a : s){
    //     cout << a <<" ";
    // }
      erase(r1x);
      erase(r2x);
      erase(r1y);
      erase(r2y);

    // cout << s.size();

      if(s.size() >= 2){
          return false;
      }
      return true;
}

int32_t main(){
    fast
    int t;
    cin >> t;
    for(int i =1; i<=t; i++){

        int kx,ky,r1x,r2x,r1y,r2y;
        

        cin >> kx>>ky>> r1x>>r1y >> r2x >>r2y;


        if(((kx == 1 && ky == 1 )|| (kx == 8 && ky ==8)) &&checkSafe(kx,ky,r1x,r1y,r2x,r2y)){
            cout << "YES\n";
        }else{
            cout << "NO\n";
        }

    }
    return 0;
}