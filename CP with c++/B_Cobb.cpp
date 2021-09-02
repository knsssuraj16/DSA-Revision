#include <bits/stdc++.h>
using namespace std;
#define endl ("\n")
#define int long long
#define fast ios_base::sync_with_stdio(false), cin.tie(nullptr), cout.tie(nullptr);




    

int32_t main(){
    fast
    int t;
    int a[100001];
    cin >> t;
    while(t--){
        int n,k;
        cin >>n>>k;
        int l = max(1LL, n - 2 * k);

        int res=-9999999999999999;
        for(int j =1; j<= n; j++){
            cin>>a[j];
            }

        
        for(int i =l; i< n; i++){
                for(int j=i+1;j<=n; j++){
                 res = max(( i*j-k*(a[i]|a[j])), res);
                }
            
            }
     
            // int a= (ai|vj);
            // int ks = k * a;
            // int tem= ((j-1) *j) -ks;
            // res = max(res,tem);
            // ai=vj;
        cout<< res<<endl;
       

    }


    
   
    return 0;
}