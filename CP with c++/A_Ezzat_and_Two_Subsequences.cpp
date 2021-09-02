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
        int n;
        cin>>n;
        double arr[n];
        for(int i= 0; i< n;i++){
            cin >> arr[i];
        }

        sort(arr,arr+n,greater<int>());
        double tot  =arr[0];
        double loc  =0.0;
        for(int i= 1; i< n;i++){
           loc+=arr[i];
        }
        loc =loc/(n-1);

        printf("\n%.9lf",(tot+ loc));

    }


    
   
    return 0;
}