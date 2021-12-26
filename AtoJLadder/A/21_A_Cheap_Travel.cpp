#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define pi (3.141592653589)
#define mod 1e9+7

#define float double

#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);


int32_t main(){
    fast
    
    int n,m ,a,b;
    cin >> n >> m >>a>> b;

    int tot = 0;
 
   
   
        if((m* a) <= b){
            tot += n*a;
        }else{
            tot = b * (n / m ); 
            if(n % m != 0){
                  n = n % m;
                tot+= min(a * n ,b);
            }
        }

       

    cout << tot <<endl;
    
    return 0;
}